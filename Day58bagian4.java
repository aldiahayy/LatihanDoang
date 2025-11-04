package array;
/*Soal 4: Inventarisasi Stok Barang
Sebuah toko kelontong ingin mendata stok dari 5 jenis barang yang mereka jual. Buatlah
program untuk menyimpan jumlah stok dari kelima barang tersebut ke dalam array int.
Program harus menganalisis array tersebut dan menampilkan:
1. Total semua stok barang.
2. Berapa banyak barang yang stoknya "Aman" (stok > 10).
3. Berapa banyak barang yang stoknya "Tipis" (stok 1-10).
4. Berapa banyak barang yang "Habis" (stok = 0).
Petunjuk:
1. Buat Scanner dan int[] stokBarang = new int[5];.
2. Buat loop untuk mengisi array stok.
3. Siapkan 4 variabel: int totalStok = 0, int countAman = 0, int countTipis = 0, int
countHabis = 0.
4. Buat loop kedua untuk menganalisis array stokBarang.
5. Di dalam loop, tambahkan totalStok += stokBarang[i].
6. Gunakan if-else if-else untuk mengkategorikan stokBarang[i] dan tambahkan nilai
counter yang sesuai (countAman++, countTipis++, atau countHabis++).
7. Cetak hasilnya setelah loop selesai.
Output yang Diharapkan:
(Setelah input 5 stok, misal: 25, 8, 0, 50, 2)
Total semua stok barang: 85
Jumlah barang stok Aman (>10): 2
Jumlah barang stok Tipis (1-10): 2
Jumlah barang stok Habis (0): 1*/
import java.util.Scanner;
public class bagian13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0, countAman = 0, countTipis = 0,countHabis = 0;
        int []stok = new int[5];
        for (int i = 0; i < stok.length; i++) {
            System.out.print("Masukkan stok barang ke-"+(i+1)+": ");
            stok[i] = sc.nextInt();
        }
        for (int i = 0; i < stok.length; i++) {
            total+=stok[i];
            
            if (stok[i] == 0) {
                countHabis++;
            }else if (stok[i] > 1 && stok[i] < 10) {
                countTipis++;
            }else{
                countAman++;
            }
        }
        System.out.println("Total semua stok barang        : " + total);
        System.out.println("Jumlah barang stok Aman (>10)  : " + countAman);
        System.out.println("Jumlah barang stok Tipis (1-10): " + countTipis);
        System.out.println("Jumlah barang stok Habis (0)   : " + countHabis++);
    }
}
