package LatihanISC;
import java.util.Scanner;
public class soal21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a >= 85) {
            System.out.println("A");
        } else if (a >= 75) {
            System.out.println("B");
        } else if (a >= 60) {
            System.out.println("C");
        } else if (a >= 40) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }
    }
}
