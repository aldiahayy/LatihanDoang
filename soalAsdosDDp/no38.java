import java.util.Scanner;
public class no38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan jumlah buku terlambat: ");
        int [] buku = new int[sc.nextInt()];
        int denda;
        int total = 0;
        for (int i = 0; i < buku.length; i++) {
            System.out.print("Masukan jumlah hari telat buku ke-" +(i+1)+": ");
            buku[i] = sc.nextInt();
            if (buku[i] > 7) {
                denda = 10000;
                total += denda;
            }else if (buku[i] > 3) {
                denda = 5000;
                total += denda;
            }else if (buku[i] > 0) {
                denda = 2000;
                total += denda;
            }else{
                denda = 0;
                total += denda;
            }
        }
            System.out.println("\n>>> Program Kasir Perpustakaan <<<");
            System.out.println("Jumlah buku yang terlambat  : " + buku.length);
        for (int i = 0; i < buku.length; i++) {
            System.out.println("Jumlah hari telat buku ke-" +(i+1)+" : " + buku[i]);
        }
            System.out.println("Total denda : " + total);
    }
}
