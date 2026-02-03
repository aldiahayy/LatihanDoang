import java.util.Scanner;
public class no36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan angka: ");
        int angka = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + angka + " = " + (i*angka));
        }
    }
}
