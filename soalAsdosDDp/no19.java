import java.util.Scanner;
public class no19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan jumlah motor: ");
        int jumlah = sc.nextInt();
        int biaya = 0;
        int total = 0;
        for (int i = 1; i <= jumlah; i++) {
            System.out.print("Masukan biaya ke-" + i +": ");
            biaya = sc.nextInt();
            total += biaya;
        }
        System.out.println("Total : " + total);
    }
}
