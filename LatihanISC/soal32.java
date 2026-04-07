package LatihanISC;
import java.util.Scanner;
public class soal32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[sc.nextInt()];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Cari: ");
        int c = sc.nextInt();
        int d = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == c) {
                d = i;
                break;
            }
        }
      
        if (d == -1) {
            System.out.println("Tidak ditemukan");
        } else {
            System.out.println("Ditemukan di indeks " + d);
        }
      
    }
}
