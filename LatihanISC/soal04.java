package LatihanISC;
import java.util.Scanner;
public class soal04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();
        
        String biner = angka + " jika dikonversi ke biner akan menjadi " + Integer.toString(angka, 2);
        String oktal = angka + " jika dikonversi ke oktal akan menjadi " + Integer.toString(angka, 8);
        String desimal = angka + " jika dikonversi ke desimal akan menjadi " + Integer.toString(angka, 10);
        String heksadesimal = angka + " jika dikonversi ke heksadesimal akan menjadi " + Integer.toString(angka, 16);
        
        System.out.println(biner);
        System.out.println(oktal);
        System.out.println(desimal);
        System.out.println(heksadesimal);   
    }   
}
