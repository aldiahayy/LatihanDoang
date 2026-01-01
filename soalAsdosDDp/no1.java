/*Buatlah program Java yang dapat menyimpan nilai beberapa mahasiswa ke dalam array, kemudian menghitung dan menampilkan rata-rata nilainya.

Petunjuk:
        •        Gunakan Scanner untuk input jumlah mahasiswa dan nilai mereka.
        •        Simpan semua nilai dalam array.
        •        Gunakan perulangan untuk menghitung total dan rata-rata.*/
import java.util.Scanner;
public class no1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan jumlah nilai: ");
        int nilai [] = new int[sc.nextInt()];
        double total = 0;
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukan nilai ke-"+(i+1)+": ");
            nilai [i]= sc.nextInt();
            total+=nilai[i];
        }
        System.out.println("Rata-rata: " +((double)total/nilai.length));
    }
}
