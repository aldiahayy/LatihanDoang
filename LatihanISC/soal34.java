package LatihanISC;
import java.util.Scanner;
public class soal34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n [] = new int[sc.nextInt()];
        double t = 0;
        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }
        int max = n[0];
        int min = n[0];
        int l = 0;
        for (int i = 0; i < n.length; i++) {
            t += n[i];
            if (n[i] > max) {
                max = n[i];
            }
            if (n[i] < min) {
                min = n[i];
            }
            if (n[i] >= 60) {
                l++;
            }
        }
        System.out.println(t / n.length);
        System.out.println(max);
        System.out.println(min);
        System.out.println(l);
    }
}
