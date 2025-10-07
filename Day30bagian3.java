package enamOkt;

import java.util.Scanner;
/*Seorang guru sedang membagikan sejumlah permen kepada murid-muridnya. Setiap murid harus mendapatkan jumlah permen yang sama, dan tidak boleh ada sisa permen setelah semua permen dibagikan. Diberikan sejumlah permen P dan jumlah murid M, hitunglah berapa banyak permen yang diterima setiap murid, dan berapa banyak permen yang tersisa jika ada.
Format Input :
Baris pertama berisi sebuah bilangan bulat positif P yang menunjukkan jumlah total permen.
Baris kedua berisi sebuah bilangan bulat positif M yang menunjukkan jumlah murid.
Format Output :
Baris pertama berisi sebuah bilangan bulat positif yang menunjukkan jumlah permen yang diterima oleh setiap murid.
Baris kedua berisi sebuah bilangan bulat positif yang menunjukkan sisa permen yang tidak terbagi.*/
public class soal3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int m = sc.nextInt();
        
        System.out.println(p/m);
        System.out.println(p%m);
    }
    
}
