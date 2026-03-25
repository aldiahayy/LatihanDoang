package LatihanISC;
import java.util.Scanner;
public class soal12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] plat = new String[10];
        boolean cek = false;
        for (int i = 0; i < plat.length; i++) {
            System.out.print("Masukkan plat ke-" + (i + 1) + ": ");
            plat[i] = sc.nextLine();
        }
      
        System.out.print("Masukkan plat yang dicari: ");
        String cari = sc.nextLine();
        for (int i = 0; i < plat.length; i++) {
            if (plat[i].equalsIgnoreCase(cari)) {
                cek = true;
                break;
            }
        }
      
        if (cek == true) {
            System.out.println("Status: Mobil ditemukan di parkiran.");
        } else {
            System.out.println("Status: Mobil tidak ditemukan");
        }
    }
}
