package LatihanISC;
import java.util.Scanner;
public class soal11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyak siswa: ");
        int n = sc.nextInt();
        String[] nama = new String[n];
        double[] nilai = new double[n];
        sc.nextLine();
        double total = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nama siswa ke-" + (i + 1) + ": ");
            nama[i] = sc.nextLine();
            System.out.print("Masukkan nilai " + (nama[i]) + ": ");
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
        
        double rata = (double) total / n;
        int r = 0;
        for (double d : nilai) {
            if (d > rata) {
                r++;
            }
        }
        
        System.out.println("Rata-rata nilai kelas: " + rata);
        System.out.println("Nilai tertinggi diraih oleh: " + nt + ", nilai: " + max);
        System.out.println("Jumlah siswa di atas rata-rata: " + r + " orang");
    }
}
