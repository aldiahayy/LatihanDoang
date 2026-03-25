package LatihanISC;
import java.util.Scanner;
public class soal14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0, countAman = 0, countTipis = 0, countHabis = 0;
        int[] stok = new int[5];
        for (int i = 0; i < stok.length; i++) {
            System.out.print("Masukkan stok barang ke-" + (i + 1) + ": ");
            stok[i] = sc.nextInt();
        }
        
        for (int i = 0; i < stok.length; i++) {
            total += stok[i];
            if (stok[i] == 0) {
                countHabis++;
            } else if (stok[i] > 1 && stok[i] < 10) {
                countTipis++;
            } else {
                countAman++;
            }
        }

        System.out.println("Total semua stok barang        : " + total);
        System.out.println("Jumlah barang stok Aman (>10)  : " + countAman);
        System.out.println("Jumlah barang stok Tipis (1-10): " + countTipis);
        System.out.println("Jumlah barang stok Habis (0)   : " + countHabis++);
    }
}
