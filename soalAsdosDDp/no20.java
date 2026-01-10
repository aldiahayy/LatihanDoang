import java.util.Scanner;
public class no20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan jumlah angka: ");
        int angka[] = new int[sc.nextInt()];
        for (int i = 0; i < angka.length; i++) {
            angka[i] = sc.nextInt();
        }
        for (int i = angka.length - 1; i >= 0; i--) {
            System.out.print(angka[i]+" ");
        }
    }
}
