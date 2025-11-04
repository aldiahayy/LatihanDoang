package array;
/*Soal 5: Struk Belanja Sederhana
Buatlah program kasir yang dapat mencatat beberapa barang yang dibeli pelanggan.
Pertama, program menanyakan "Jumlah jenis barang yang dibeli: ".
Gunakan 3 array paralel (Nama Barang, Harga Barang, Jumlah Beli) yang ukurannya sesuai
input tadi.
Setelah semua data diisi, tampilkan struk belanja yang berisi nama barang, harga satuan,
jumlah beli, dan subtotal (harga * jumlah). Di akhir, tampilkan Total Belanja (jumlah dari
semua subtotal).
Petunjuk:
1. Minta jumlah jenis barang (int n).
2. Deklarasikan 3 array: String[] nama = new String[n];, int[] harga = new int[n];, int[]
jumlah = new int[n];.
3. Buat loop (dari 0 sampai n-1) untuk mengisi ketiga array tersebut.
4. Buat variabel int totalBelanja = 0;.
5. Buat loop kedua untuk mencetak struk.
6. Di dalam loop cetak, hitung int subtotal = harga[i] * jumlah[i].
7. Tambahkan subtotal ke total belanja: totalBelanja += subtotal;.
8. Cetak nama[i], harga[i], jumlah[i], dan subtotal.
9. Setelah loop cetak selesai, cetak totalBelanja.
Output yang Diharapkan:
Jumlah jenis barang yang dibeli: 3
Barang ke-1
Nama: Buku
Harga: 5000
Jumlah: 2
Barang ke-2
Nama: Pena
Harga: 3000
Jumlah: 5
Barang ke-3
Nama: Penghapus
Harga: 1000
Jumlah: 3
--- Struk Belanja ---
Buku (Rp 5000 x 2) = Rp 10000
Pena (Rp 3000 x 5) = Rp 15000
Penghapus (Rp 1000 x 3) = Rp 3000
------------------------- +
Total Belanja: Rp 28000*/
import java.util.Scanner;
public class bagian14 {
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
