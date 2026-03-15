import java.util.Scanner;
public class soal03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan harga: ");
        int harga = sc.nextInt();
        double diskon;
        double total = harga;
        if (harga  == 100000) {
            diskon = harga * 0.1;
            total = harga - diskon;
        } else if (harga == 500000) {
            diskon = harga * 0.2;
            total = harga - diskon;
        } else {
            System.out.println("tidak dapat diskon");
        }
        System.out.println("Total harga  : " + total);
    }
