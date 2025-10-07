package enamOkt;

import java.util.Scanner;

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
