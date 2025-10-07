package enamOkt;

import java.util.Scanner;

public class soal5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int biayaBahan = sc.nextInt();
        int biayaPekerja = sc.nextInt();
        int biayaIzin = sc.nextInt();
        
        double tambahBahan = biayaBahan * 0.20;
        int hasilBahan = (int) (biayaBahan + tambahBahan);
        double tambahPekerja = biayaPekerja * 0.15;
        int hasilPekerja = (int) (biayaPekerja + tambahPekerja);
        
        System.out.println(hasilBahan+hasilPekerja+biayaIzin);
        
        
        
    }
    
}
