package LatihanISC;

import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        /*Bayangkan Kamu sedang memprogram sebuah sensor cuaca. Sensor ini merekam tiga data: suhu (double), kelembapan (int), dan ID sensor (int). Tugas Kamu adalah memformat data ini menjadi sebuah laporan String untuk tiga tujuan yang berbeda.

Tugas 1: Pesan Log Cepat (untuk Programmer)
Programmer sering butuh pesan singkat untuk debugging yang cepat dibuat. Buatlah sebuah String bernama pesanLog yang berisi status suhu.
Gunakan metode konversi yang paling ringkas dan cepat ditulis ("" + ...) untuk menggabungkan String "DEBUG: Status Suhu = " dengan nilai suhu.

Tugas 2: Laporan Resmi (untuk Pengguna)
Laporan ini harus jelas dan dibuat dengan cara yang paling standar. Buatlah sebuah String bernama laporanKelembapan.
Gunakan metode konversi yang paling umum dan direkomendasikan (String.valueOf()) untuk mengubah nilai kelembapan menjadi String, lalu gabungkan dengan String "Tingkat Kelembapan Udara: " dan String " %".

Tugas 3: Kode Identifikasi Unik (untuk Sistem)
Sistem lain membutuhkan ID sensor ini dalam format Heksadesimal (basis 16) untuk pemrosesan data. Buatlah sebuah String bernama idHeksadesimal.
Gunakan metode konversi dari Wrapper Class yang bisa mengubah basis angka (Integer.toString()) untuk mengubah idSensor menjadi String heksadesimal.
Gabungkan hasilnya dengan String "SENSOR-ID-".

Terakhir, cetak ketiga String hasil konversi tersebut.*/

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan suhu: ");
        double suhu = sc.nextDouble();
        System.out.print("Masukkan kelembapan: ");
        int kelembapan = sc.nextInt();
        System.out.print("Masukkan ID Sensor: ");
        int IDSensor = sc.nextInt();
        
        String pesan = "DEBUG: Status Suhu = " + suhu;
        String laporanKelembapan = "Tingkat Kelembapan Udara: " + String.valueOf(kelembapan) + " %";
        String idHeksadesimal = "SENSOR-ID-" + Integer.toString(IDSensor, 16);
        
        System.out.printf("%-20s : %-20s %n", "Pesan Log Cepat", pesan);
        System.out.printf("%-20s : %-20s %n", "Laporan Resmi", laporanKelembapan);
        System.out.printf("%-20s : %-20s %n", "Kode ID Heksadesimal", idHeksadesimal);
    }
}
