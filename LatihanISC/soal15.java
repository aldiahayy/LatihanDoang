package LatihanISC;
import java.util.Scanner;
public class soal15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah jenis barang: ");
        int n = sc.nextInt();
        sc.nextLine();
        int total = 0;
        String [] nama = new String [n];
        int [] harga = new int [n];
        int [] jml = new int [n];
      
        for (int i = 0; i < n; i++) {
            System.out.println("barang " + (i+1));
            System.out.print("Nama: ");
            nama [i] = sc.nextLine();
            System.out.print("Harga: ");
            harga[i] = sc.nextInt();
            System.out.print("Jumlah: ");
            jml [i] = sc.nextInt();
            sc.nextLine();      
        }
      
        System.out.println("--- Struk Belanja ---");
        for (int i = 0; i < n; i++) {
            System.out.println(nama[i]+"(Rp " +(harga[i] +" x "+ jml[i])+") = Rp"+ (harga[i] * jml[i]));
            total += harga[i]*jml[i];
        }
      
        System.out.println("------------------------- +");
        System.out.println("Total Belanja: Rp "+ total);
    }
}
