/*Buat sebuah program yang menerima 5 angka sebagai input.
Program kemudian menentukan dan menampilkan angka terbesar dan angka terkecil.

contoh input :
4 10 3 8 6

output :
Angka terbesar: 10
Angka terkecil: 3*/
import java.util.Scanner;
public class no3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilai [] = new int[5];
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukan nilai ke-"+(i+1)+": ");
            nilai [i]=sc.nextInt();
        }
        int max = nilai[0];
        int min = nilai[0];
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] > max) {
                max = nilai[i];
            }
            if (nilai[i] < min) {
                min = nilai[i];
            }
        }
        System.out.println("Angka terbesar: "+ max);
        System.out.println("Angka terkecil: "+ min);
    }
}
