import java.util.Scanner;
public class no30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan nilai teori: ");
        int teori = sc.nextInt();
        System.out.print("Masukan nilai praktek: ");
        int praktek = sc.nextInt();
        
        if (teori >= 70 && praktek >= 80) {
            System.out.println("Selamat, Anda lulus");
        }else{
            System.out.println("Maaf, Anda belum lulus");
        }
    }
}
