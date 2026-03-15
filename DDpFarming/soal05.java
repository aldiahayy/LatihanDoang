import java.util.Scanner;
public class soal05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pin = "1234a";

        boolean deteksi = false;
        for (int i = 1; i <= 3; i++) {
            System.out.print("Silahkan masukan pin: ");
            String pw = sc.nextLine();
            if (pw.equals(pin)) {
                deteksi = true;
                break;
            } else {
                deteksi = false;
            }
        }
        if (deteksi) {
            System.out.println("\nSilahkan pilih menu");
            System.out.println("1.Cek saldo");
            System.out.println("2.Tarik uang");
            System.out.println("3.Setor uang");
            System.out.print("Masukan pilihan: ");
            int p = sc.nextInt();
            switch (p) {
                case 1:
                    System.out.println("Anda memilih menu Cek saldo");
                    break;
                case 2:
                    System.out.println("Anda memilih menu Tarik uang");
                    break;
                case 3:
                    System.out.println("Anda memilih menu Setor uang");
                    break;
                default:
                    System.out.println("pilihan tidak ada");
                    break;
            }

        } else {
            System.out.println("Akun Anda di blokir");
        }
    }
}
