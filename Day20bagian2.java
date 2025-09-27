package LatihanISC;

import java.util.Scanner;

public class soal4 {
    public static void main(String[] args) {
        /*Buatlah sebuah program yang menerima inputan angka bulat 
Dimana inputan tersebut akan dikonversi menjadi Sistem Basis Bilangan, jadi yang dicetak adalah basis bilangan tersebut dengan label yang jelas

Pada dasarnya yang digunakan adalah 4 basis bilangan yaitu

- Basis 2 (Biner): Bahasa asli komputer yang hanya menggunakan angka 0 dan 1.
- Basis 8 (Oktal): Menggunakan angka dari 0 hingga 7. Dulu sering digunakan karena mudah dikonversi dari biner.
- Basis 10 (Desimal): Sistem yang kita gunakan sehari-hari, menggunakan angka dari 0 hingga 9.
- Basis 16 (Heksadesimal): Sangat umum untuk merepresentasikan alamat memori atau kode warna. Menggunakan 0-9 dan huruf A-F.*/
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();
        
        String biner = angka + " jika dikonversi ke biner akan menjadi " + Integer.toString(angka, 2);
        String oktal = angka + " jika dikonversi ke oktal akan menjadi " + Integer.toString(angka, 8);
        String desimal = angka + " jika dikonversi ke desimal akan menjadi " + Integer.toString(angka, 10);
        String heksadesimal = angka + " jika dikonversi ke heksadesimal akan menjadi " + Integer.toString(angka, 16);
        
        System.out.println(biner);
        System.out.println(oktal);
        System.out.println(desimal);
        System.out.println(heksadesimal);
        
    }
    
}
