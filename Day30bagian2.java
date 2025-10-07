package enamOkt;

import java.util.Scanner;
/*Seorang petani tua meninggalkan sejumlah harta warisan untuk ketiga anaknya setelah wafat. Harta tersebut terdiri dari sejumlah emas dalam bentuk batangan yang harus dibagi sesuai permintaan khusus petani tersebut. Petani ingin:
· Anak pertama mendapatkan setengah dari total emas.
· Anak kedua mendapatkan sepertiga dari total emas yang tersisa setelah anak pertama mengambil bagiannya.
· Anak ketiga mendapatkan sisanya.
Tugas Anda adalah menentukan berapa jumlah emas yang didapatkan oleh
masing-masing anak. Jumlah total emas akan diberikan sebagai input, dan Anda harus menghitung pembagian emas sesuai dengan aturan di atas.
Format Input :
Sebuah bilangan bulat positif T yang merupakan jumlah total emas (dalam batangan).
Format Output :
Cetak tiga bilangan bulat yang masing-masing menyatakan jumlah emas
yang diterima oleh anak pertama, anak kedua, dan anak ketiga secara berurutan.*/
public class soal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt();
        
        int bagi1 = e / 2;
        int sisa = e - bagi1;
        int bagi2 = sisa / 3;
        int bagi3 = e - bagi1 - bagi2;
        
        System.out.println(bagi1 + " " + bagi2 + " " + bagi3);
       
    }
    
}
