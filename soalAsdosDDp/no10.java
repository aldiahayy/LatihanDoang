import java.util.Scanner;
public class no10 {
    public static void main(String[] args) {
    deteksi();
    }
    public static void deteksi(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan angka: ");
        int angka = sc.nextInt();
        if (angka%2==0) {
            System.out.println(angka+" adalah angka genap");
        }else{
            System.out.println(angka+" adalah angka ganjil");
        }
    }
}
