package LatihanISC;
import java.util.Scanner;
public class soal22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("Nasi goreng");
                break;
            case 2:
                System.out.println("Mie Goreng");
                break;
            case 3:
                System.out.println("Ayam Geprek");
                break;
            case 4:
                System.out.println("Keluar");
                break;
            default:
                System.out.println("Pilihan tidak ada");
                break;
        }
    }
}
