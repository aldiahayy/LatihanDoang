import java.util.Scanner;
public class no46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Gaji Pokok: ");
        int gaji = sc.nextInt();
        System.out.print("Masukan Lama Kerja(tahun): ");
        int tahun = sc.nextInt();
        
        boolean deteksi = false;
        double bonus;
        if (tahun >= 10) {
            deteksi = true;
            System.out.println("Kenaikan 20% : " + gaji);
            bonus = gaji * 0.2;
        }else if (tahun >= 5) {
            deteksi = true;
            System.out.println("Kenaikan 10% : " + gaji);
            bonus = gaji * 0.1;
        }else if (tahun >= 1) {
            deteksi = true;
            System.out.println("Kenaikan 5%  : " + gaji);
            bonus = gaji * 0.05;
        }else{
            deteksi = false;
            System.out.println("Kenaikan 0%  : " + gaji);
            bonus = gaji;
        }
        if (deteksi) {
            System.out.println("Gaji Total   : " + (gaji + bonus));
        }else{
            System.out.println("Gaji Total   : " + (gaji));
        }
    }
}
