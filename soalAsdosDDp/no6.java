/*Buatlah sebuah program Java yang menggunakan array untuk menyimpan minimal 10 nama mahasiswa.
Program harus menampilkan seluruh nama yang ada di dalam array.
kemudian meminta pengguna untuk memasukkan sebuah nama yang ingin dicari.
Setelah pengguna memasukkan nama tersebut, program akan melakukan pencarian untuk menemukan
posisi nama tersebut di dalam array. Jika ditemukan, program akan menampilkan pesan berupa nama
yang dicari beserta indeks ke-berapa nama tersebut berada. Pencarian nama tidak bersifat case-sensitive.

Menampilkan isi array terlebih dahulu
Nama :  rifky rajab daud rendi hanip parma azisah hasnur ali ade
Input : 
cari : hanip
Output : 
rajab berada pada index ke-4

Input : 
cari : daud
Output : daud
rajab berada pada index ke-2*/
import java.util.Scanner;
public class no6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama[] = {"rifky","rajab","daud","rendi","hanip","parma","azisah","hasnur","ali","ade"};
        System.out.print("Nama: ");
        for (int i = 0; i < nama.length; i++) {
            System.out.print(nama[i]+" ");
        }
        System.out.println("");
        System.out.print("Cari: ");
        String cari = sc.nextLine();
        for (int i = 0; i < nama.length; i++) {
            if (cari.equalsIgnoreCase(nama[i])) {
                System.out.println(cari + " ditemukan di index ke-" + i);
            }
        }
    }
}
