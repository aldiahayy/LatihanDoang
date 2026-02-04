import java.util.Scanner;
public class no40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan angka(x): ");
        int x = sc.nextInt();
        String deteksi = "";
       
        if (x % 2 == 0) {
            if (x > 0) {
                deteksi = " adalah angka genap dan positif";
            }else if (x < 0) {
                deteksi = " adalah angka genap dan negatif";
            }else{
                deteksi = " adalah angka genap dan nol";
            }
        }else{
            if (x > 0) {
                deteksi = " adalah angka ganjil dan positif";
            }else{
                deteksi = " adalah angka ganjil dan negatif";
            }
        }
        System.out.println("Angka " + x + deteksi);
    }
}
