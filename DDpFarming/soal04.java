import java.util.Scanner;
public class soal04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan jumlah angka: ");
        int angka[] = new int[sc.nextInt()];
        double total = 0;
        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukan angka ke-" + (i+1) + ": ");
            angka[i] = sc.nextInt();
        }
        int max = angka[0];
        int min = angka[0];
        for (int i = 0; i < angka.length; i++) {
            total += angka[i];
            if (angka[i] > max) {
                max = angka[i];
            }
            if (angka[i] < min) {
                min = angka[i];
            }
        }
        System.out.println("Rata-rata : " + total / angka.length);
        System.out.println("Nilai max : " + max);
        System.out.println("Nilai min : " + min);
    }
}
