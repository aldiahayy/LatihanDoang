package enamOkt;

import java.util.Scanner;

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
