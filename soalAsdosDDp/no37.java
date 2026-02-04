import java.util.Scanner;
public class no37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan angka: ");
        int angka = sc.nextInt();
        if (angka == 0) {
            System.out.println("nol");
        }else{
        if (angka % 2 == 0) {
            if (angka > 0) {
                System.out.println("genap-positif");
            }else{
                System.out.println("genap-negatif");
            }
        }else{
            if (angka > 0) {
                System.out.println("ganjil-positif");
            }else{
                System.out.println("ganjil-negatif");
            }
        }
        }
    }
}
