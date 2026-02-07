import java.util.Scanner;
public class no41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan angka: ");
        double angka = sc.nextDouble();
        String deteksi = "";
        if (angka == 0) {
            deteksi = "ini adalah angka nol";
        }else if (angka % 1 == 0) {
            deteksi = "Bilangan bulat";
        }else{
            deteksi = "Bilangan desimal";
        }
        System.out.println(deteksi);
    }
}
