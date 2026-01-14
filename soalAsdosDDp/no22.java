import java.util.Scanner;
public class no22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan jumlah uang awal: ");
        int awal = sc.nextInt();
        System.out.print("Masukan pengeluaran pertama: ");
        int pengeluaran1 = sc.nextInt();
        System.out.print("Masukan jumlah pemasukkan pertama: ");
        int pemasukan1 = sc.nextInt();
        System.out.print("Masukan jumlah pengeluaran kedua: ");
        int pengeluaran2 = sc.nextInt();
        System.out.print("Masukan jumlah pemasukkan kedua: ");
        int pemasukan2 = sc.nextInt();
        
        System.out.println("Total uang anda sekarang adalah : " + (awal-pengeluaran1+pemasukan1-pengeluaran2+pemasukan2));
    }
}
