package LatihanISC;
import java.util.Scanner;
public class soal25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int g = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                g++;
            }
        }
        System.out.println(g);
    }
}
