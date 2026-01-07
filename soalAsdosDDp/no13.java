import java.util.Scanner;
public class no13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan nama pelanggan: ");
        String nama = sc.nextLine();
        System.out.print("Masukan nama barang: ");
        String barang = sc.nextLine();
        System.out.print("Masukan Harga satuan barang: ");
        int harga = sc.nextInt();
        System.out.print("Masukan jumlah barang: ");
        int jumlah = sc.nextInt();
        
        System.out.println(">>> Struk Pembelian <<<");
        System.out.println("Nama pelanggan            : " + nama);
        System.out.println("Barang yang dibeli        : " + barang);
        System.out.println("Harga satuan barang       : " + harga);
        System.out.println("Jumlah barang yang dibeli : " + jumlah);
        System.out.println("Total harga               : " + (harga*jumlah));
    }
}
