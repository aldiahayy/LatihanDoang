import java.util.Scanner;
public class no25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan nilai pertama: ");
        int nilai1 = sc.nextInt();
        System.out.print("Masukan nilai kedua: ");
        int nilai2 = sc.nextInt();
        System.out.print("Masukan nilai ketiga: ");
        int nilai3 = sc.nextInt();
        
        boolean nilai = nilai1 >= 50 && nilai2 >= 50 && nilai3 >= 50;
        boolean total = (nilai1 + nilai2 + nilai3) >= 200;
        if (nilai && total) {
            System.out.println("Selamat EsKom");
        }else{
            System.out.println("EsKom-nya di tunda dulu Nice Try");
        }
    }
}
