package LatihanISC;
import java.util.Scanner;
public class soal03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan suhu: ");
        double suhu = sc.nextDouble();
        System.out.print("Masukkan kelembapan: ");
        int kelembapan = sc.nextInt();
        System.out.print("Masukkan ID Sensor: ");
        int IDSensor = sc.nextInt();
        
        String pesan = "DEBUG: Status Suhu = " + suhu;
        String laporanKelembapan = "Tingkat Kelembapan Udara: " + String.valueOf(kelembapan) + " %";
        String idHeksadesimal = "SENSOR-ID-" + Integer.toString(IDSensor, 16);
        
        System.out.printf("%-20s : %-20s %n", "Pesan Log Cepat", pesan);
        System.out.printf("%-20s : %-20s %n", "Laporan Resmi", laporanKelembapan);
        System.out.printf("%-20s : %-20s %n", "Kode ID Heksadesimal", idHeksadesimal);
    }
}
