import java.util.Scanner;
public class soal01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan nama: ");
        String nama = sc.nextLine();
        int nilai = 0;
        double total = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.print("Masukan nilai ke-" + i + ": ");
            nilai = sc.nextInt();
            total += nilai;
        }
        System.out.println("\nNama mahasiwa : " + nama);
        double rataRata = total / 3;
        System.out.println("rata-rata     : " + rataRata);
        if (rataRata >= 60) {
            System.out.println("Status        : Lulus");
        } else {
            System.out.println("Status        : Tidak Lulus");
        }
    }
}
