import java.util.Scanner;
public class no34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan batas angka: ");
        int angka = sc.nextInt();
        int total = 0;
        for (int i = 1; i <= angka; i++) {
            total+=i;
            System.out.print(i);
            if (i<angka) {
                System.out.print(" + ");
            }
        }
        System.out.println(" = " + (total));
    }
}
