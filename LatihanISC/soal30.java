package LatihanISC;
import java.util.Arrays;
import java.util.Scanner;
public class soal30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilai = new int[sc.nextInt()];
        for (int i = 0; i < nilai.length; i++) {
            nilai[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(nilai));
    }
}
