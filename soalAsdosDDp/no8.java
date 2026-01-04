/*Deklarasikan sekaligus inisialisasi 2 array dengan tipe data berbeda (float dan char) kemudian tampilkan outputnya!

Contoh output:
Array float:
1.5 2.3 3.7 4.2 5.9 6.2 7.3 

Array char:
B E L A J A R*/
public class no8 {
    public static void main(String[] args) {
        float f [] = {1.5f,2.3f,3.7f,4.2f,5.9f,6.2f,7.3f};
        char c [] = {'B','E','L','A','J','A','R'};
        System.out.println("Array float:");
        for (float g : f) {
            System.out.print(g+" ");
        }
        System.out.println("\nArray char:");
        for (char d : c) {
            System.out.print(d+" ");
        }
    }
}
