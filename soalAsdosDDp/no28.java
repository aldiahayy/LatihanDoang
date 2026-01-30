import java.util.Scanner;
public class no29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan total buku yang dipinjam: ");
        int buku = sc.nextInt();
        int sisa = 0;
        System.out.println("Total buku          : " + buku);
        if (buku%8 != 0) {
        sisa++;
        }
        System.out.println("Rak yang dibutuhkan : " + (buku/8 + sisa));
        System.out.println("Sisa buku           : " + (buku%8));
    }
}
