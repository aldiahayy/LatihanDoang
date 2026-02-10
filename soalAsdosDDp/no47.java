import java.util.Scanner;
public class no47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan pendapatan bulanan (Rp): ");
        int pendapatan = sc.nextInt();
        System.out.print("Masukan jumlah tanggungan keluarga: ");
        int tanggungan = sc.nextInt();
        System.out.print("Masukan riwayat kredit (baik/buruk): ");
        sc.nextLine();
        String riwayat = sc.nextLine().toUpperCase();
        char konver = riwayat.charAt(1);
        
        if ((pendapatan >= 8000000) && (tanggungan <= 2) && (konver == 'A')) {
            System.out.println("Status     : Disetujui Penuh");
        }else if ((pendapatan >= 5000000) && (tanggungan <= 3) && (konver == 'A')) {
            System.out.println("Status     : Disetujui Bersyarat");
            System.out.println("Keterangan : Nasabah harus memberikan jaminan tambahan.");
        }else if ((pendapatan >= 3000000) && (konver == 'A')) {
            System.out.println("Status     : Dipertimbangkan");
        }else{
            System.out.println("Status     : Ditolak");
        }
    }
}
