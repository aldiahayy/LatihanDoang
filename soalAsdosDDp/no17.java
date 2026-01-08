import java.util.Scanner;
public class no17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan angka untuk tabel perkalian: ");
        int angka = sc.nextInt();
        System.out.println("Tabel perkalian " + angka);
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + angka + " = " + (angka*i));
        }
    }
}
