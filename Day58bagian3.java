package array;
/*Soal 3: Membalik Urutan Angka
Buatlah program yang meminta pengguna memasukkan 5 angka (integer). Simpan kelima
angka tersebut ke dalam sebuah array. Kemudian, tampilkan kembali kelima angka tersebut
dalam urutan terbalik (dari elemen terakhir ke elemen pertama).
Petunjuk:
1. Buat Scanner dan int[] angka = new int[5];.
2. Buat loop for (misal, i dari 0 sampai 4) untuk mengisi array.
3. Buat loop for kedua untuk mencetak. Loop ini harus berjalan mundur.
4. Inisialisasi loop cetak dengan int i = 4;, kondisi i >= 0;, dan iterasi i--.
Output yang Diharapkan:
Masukkan angka ke-1: 10
Masukkan angka ke-2: 20
Masukkan angka ke-3: 30
Masukkan angka ke-4: 40
Masukkan angka ke-5: 50
Hasil urutan terbalik:
50
40
30
20
10*/
import java.util.Scanner;
public class bagian12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] angka = new int[5];
        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan angka ke-"+(i+1)+": ");
            angka [i]= sc.nextInt(); 
        }
        System.out.println("Hasil urutan terbalik:");
        for (int i = angka.length-1; i >=0 ; i--) {
            System.out.println(angka[i]);
        }
    }
}
