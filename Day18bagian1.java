package LatihanISC;
public class soal1 {
    public static void main(String[] args) {
        /*Berikut adalah soal latihan (bisa dicommit bisa tidak)

Kamu adalah seorang kasir di sebuah toko dan sedang menghitung total belanjaan. Pelanggan membeli 1 Roti , 1 Susu , 1 Beras , 1 Minyak goreng dan 6 Frozen food, belanjaannya dikenai pajak 10% untuk total barang yang dibelinya dan 1% pajak untuk tiap barang yang dibelinya.
Diketahui 
Harga Roti = 16500
Harga susu = 65000
Harga beras = 55000
Harga minyak goreng = 43500
Harga Frozen food = 20000 */
        short roti = 16500;
        int susu = 65000;
        int beras = 55000;
        int minyak = 43500;
        int frozen = 20000 * 6;
        float pajak = 0.1f;
//        System.out.println(Byte.MAX_VALUE);
//        System.out.println(Short.MAX_VALUE);
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Long.MAX_VALUE);
//        System.out.println(Float.MAX_VALUE);
//        System.out.println(Double.MAX_VALUE);
        int totalBelanja = roti + susu + beras + minyak + frozen;
        float pajaknya = totalBelanja * pajak;
        float harganya = totalBelanja + pajaknya;
        System.out.println("Total harga : " + harganya);
        System.out.println("Total harga : " + (totalBelanja + pajaknya));
        
        
    }
    
}
