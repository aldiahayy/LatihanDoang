package array;
/*Soal 1: Analisis Nilai Kelas
Buatlah program untuk mendata nilai ujian siswa. Program harus terlebih dahulu
menanyakan jumlah siswa yang akan di-input. Kemudian, simpan nama dan nilai dari setiap
siswa menggunakan 2 array (paralel).
Setelah semua data di-input, program harus menampilkan:
1. Rata-rata nilai seluruh kelas.
2. Nama dan nilai siswa yang memiliki nilai tertinggi.
3. Jumlah siswa yang nilainya di atas rata-rata kelas.
Petunjuk:
1. Gunakan Scanner untuk menentukan ukuran array (jumlah siswa).
2. Buat loop pertama untuk mengisi String[] namaSiswa dan int[] nilaiSiswa.
3. Buat loop kedua untuk menghitung totalNilai dan mencari nilaiTertinggi (beserta
namaTertinggi).
4. Hitung rataRata = totalNilai / jumlahSiswa.
5. Buat loop ketiga untuk membandingkan nilaiSiswa[i] dengan rataRata dan hitung
jumlahnya.
Output yang Diharapkan:
Rata-rata nilai kelas: 82.5
Nilai tertinggi diraih oleh: Budi (Nilai: 95)
Jumlah siswa di atas rata-rata: 2 orang*/
import java.util.Scanner;
public class bagian10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyak siswa: ");
        int n = sc.nextInt();
        String []nama = new String[n];
        double [] nilai = new double[n];
        sc.nextLine();
        double total= 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nama siswa ke-"+(i+1)+": ");
            nama[i] = sc.nextLine();
            System.out.print("Masukkan nilai "+(nama[i])+": ");
            nilai[i] = sc.nextInt();
            sc.nextLine();
        }
        double max = nilai[0];
        String nt = nama[0];
        for (int i = 1; i < n; i++) {
            total += nilai[i];
            if (nilai[i] > max) {
                max = nilai[i];
                nt = nama[i];
            }
        }
        double rata = (double)total/n;
        int r =0;
        for (double d : nilai) {
            if (d > rata) {
                r++;
            }
        }
        System.out.println("Rata-rata nilai kelas: "+rata);
        System.out.println("Nilai tertinggi diraih oleh: "+nt+", nilai: " + max);
        System.out.println("Jumlah siswa di atas rata-rata: "+r +" orang");
        }
    }
