package array;
/*Soal 2: Pencarian Data Parkir
Sebuah sistem parkir sederhana ingin mencatat 10 plat nomor mobil yang sedang parkir di
dalam area. Buatlah program untuk menyimpan 10 plat nomor tersebut ke dalam sebuah
array.
Setelah 10 plat nomor disimpan, program akan meminta 1 input plat nomor yang ingin
dicari. Program akan mencari plat tersebut di dalam array.
Petunjuk:
1. Buat Scanner dan String[] platParkir = new String[10];.
2. Buat loop untuk mengisi 10 plat nomor.
3. Minta input "Plat yang dicari: ".
4. Buat boolean ditemukan = false;.
5. Buat loop kedua untuk mengecek setiap elemen di platParkir. Gunakan .equals()
untuk membandingkan String.
6. Jika platParkir[i].equals(platYangDicari), set ditemukan = true; dan hentikan loop
(break;).
7. Setelah loop, periksa if (ditemukan).
Output yang Diharapkan (Kasus 1):
(Setelah input 10 plat...)
Masukkan plat yang dicari: B 1234 ABC
Status: Mobil ditemukan di parkiran.
Output yang Diharapkan (Kasus 2):
(Setelah input 10 plat...)
Masukkan plat yang dicari: Z 9999 XYZ
Status: Mobil tidak ditemukan.*/
import java.util.Scanner;
public class bagian11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] plat = new String[10];
        boolean cek = false;
        for (int i = 0; i < plat.length; i++) {
            System.out.print("Masukkan plat ke-"+(i+1)+": ");
            plat[i] = sc.nextLine();
        }
        System.out.print("Masukkan plat yang dicari: ");
        String cari = sc.nextLine();
        for (int i = 0; i < plat.length; i++) {
            if (plat[i].equalsIgnoreCase(cari)) {
                cek = true;
                break;
        }
        }
        if (cek==true) {
            System.out.println("Status: Mobil ditemukan di parkiran.");
        }else{
            System.out.println("Status: Mobil tidak ditemukan");
        }
    }
}
