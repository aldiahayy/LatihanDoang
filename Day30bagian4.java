package enamOkt;

import java.util.Scanner;
/*Seorang petani memiliki dua ladang dengan ukuran berbeda. Ladang
pertama memiliki panjang P1 meter dan lebar L1 meter, sedangkan
ladang kedua memiliki panjang P2 meter dan lebar L2 meter. Petani
ingin mengetahui selisih luas antara kedua ladang tersebut.
Bantulah petani untuk menghitung selisih luas antara ladang
pertama dan ladang kedua
Format Input :
Dua integer P1 dan L1 untuk panjang dan lebar ladang pertama.
Dua integer P2 dan L2 untuk panjang dan lebar ladang kedua.
Format Output :
Satu integer yang merupakan selisih luas antara kedua ladang.
gunakan Math.abs()*/

public class soal4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p1 = sc.nextInt();
        int l1 = sc.nextInt();
        int p2 = sc.nextInt();
        int l2 = sc.nextInt();
        
        int luas1 = p1*l1;
        int luas2 = p2*l2;
        int selisih = Math.abs(luas1-luas2);
        System.out.println(selisih);
        
        
    }
    
}
