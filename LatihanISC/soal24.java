package LatihanISC;
import java.util.Scanner;
public class soal24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        int total = 0;
        while (a <= n) {
            total += a;
            a++;
        }
        System.out.println(total);
    }
}
