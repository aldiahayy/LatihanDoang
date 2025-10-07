package enamOkt;

import java.util.Scanner;
/*Seorang arsitek sedang menghitung biaya pembangunan rumah dengan
beberapa variabel biaya yang harus dihitung ulang. Kamu diminta untuk membantu menghitung total biaya
pembangunan rumah tersebut dengan beberapa operasi sederhana.
Arsitek memiliki tiga biaya awal:
· biayaBahan: biaya bahan bangunan.
· biayaPekerja: biaya upah para pekerja.
· biayaPerizinan: biaya izin pembangunan.
Setelah dilakukan perhitungan ulang, arsitek ingin memperbarui nilai
dari biaya bahan dan biaya pekerja menggunakan aturan berikut:
· biayaBahan akan dinaikkan sebesar 20%.
· biayaPekerja akan dinaikkan sebesar 15%.
Setelah itu, kamu diminta menghitung total biaya akhir yang merupakan
penjumlahan dari ketiga biaya tersebut setelah diperbarui.
Format Input :
Baris pertama berisi bilangan bulat biayaBahan
Baris kedua berisi bilangan bulat biayaPekerja
Baris ketiga berisi bilangan bulat biayaPerizinan
Format Output :
Cetak satu bilangan bulat yang merupakan total biaya pembangunan
setelah penyesuaian.*/

public class soal5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int biayaBahan = sc.nextInt();
        int biayaPekerja = sc.nextInt();
        int biayaIzin = sc.nextInt();
        
        double tambahBahan = biayaBahan * 0.20;
        int hasilBahan = (int) (biayaBahan + tambahBahan);
        double tambahPekerja = biayaPekerja * 0.15;
        int hasilPekerja = (int) (biayaPekerja + tambahPekerja);
        
        System.out.println(hasilBahan+hasilPekerja+biayaIzin);
        
        
        
    }
    
}
