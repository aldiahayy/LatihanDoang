import java.util.Arrays;
import java.util.Scanner;
public class no39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] suhu = new int [6];
        for (int i = 0; i < suhu.length; i++) {
            System.out.print("Masukan suhu ke-"+(i+1)+": ");
            suhu [i] = sc.nextInt();
        }
        System.out.println("\n>>> Program Menghitung Suhu <<<");
        for (int i = 0; i < suhu.length; i++) {
            System.out.println("Suhu ke-"+(i+1)+" : "+ suhu[i]);
        }
        int max = Arrays.stream(suhu).max().getAsInt();
        System.out.println("Suhu tertinggi : " + max);
    }
}
