import java.util.Scanner;
public class no16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String buah [] = {"apel","mangga","jeruk","pisang","anggur"};
        for (String nama : buah) {
            System.out.print("Masukan nama buah: ");
            String cari = sc.nextLine();
            if (cari.equals(nama)) {
                System.out.println("Buah tersedia");
                break;
            }else{
                System.out.println("Buah tidak tersedia");
                break;
            }
        }
    }
}
