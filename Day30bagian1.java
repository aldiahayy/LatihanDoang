package enamOkt;

import java.util.Scanner;
/*Anda diberikan sebuah papan persegi panjang berukuran M × N. Anda juga diberikan sejumlah tak terbatas kartu ceki standar berukuran 2 × 1. Anda diizinkan untuk memutar kartu-kartu tersebut. Anda diminta untuk menyusun sebanyak mungkin ceki di papan dengan syarat berikut:
1. Setiap ceki menutupi dua kotak secara penuh.
2. Tidak ada dua ceki yang saling tumpang tindih.
3. Setiap ceki harus sepenuhnya berada di dalam papan. ceki boleh menyentuh tepi papan.
Tentukan jumlah maksimum ceki yang dapat disusun sesuai dengan batasan batasan ini.
Format Input :
Dalam satu baris, Anda diberikan dua bilangan bulat M dan N (ukuran papan dalam
kotak)
Format Output :
Keluaran berupa satu angka (jumlah maksimum ceki yang dapat disusun).*/
public class soal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int c = 2*1;
        
        System.out.println(m*n/c);
                
    }
    
}
