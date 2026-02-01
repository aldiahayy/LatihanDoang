import java.util.Scanner;
public class no31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(">>> Program Evaluasi Mentor <<<");
        System.out.print("Masukan nilai teori: ");
        int teori = sc.nextInt();
        System.out.print("Masukan nilai praktik: ");
        int praktik = sc.nextInt();
        
        if (teori > 100 || teori < 0 || praktik > 100 || praktik < 0) {
            System.out.println("Nilai tidak valid! Harus antara 0 - 100");   
        }else{
        System.out.println("================================");
        System.out.println("Nilai Teori     : " + teori);
        System.out.println("Nilai Praktik   : " + praktik);
        
        if (teori >= 90 && praktik >= 90) {
            System.out.println("Predikat        : A");
            System.out.println("Keterangan      : Lulus dengan Predikat Sangat Baik");
        }else if (teori >= 80 && praktik >= 75) {
            System.out.println("Predikat        : B");
            System.out.println("Keterangan      : Lulus dengan Predikat Baik");
        }else if (teori >= 70 && praktik >= 70) {
            System.out.println("Predikat        : C");
            System.out.println("Keterangan      : Lulus dengan Predikat Cukup");
        }else if (teori < 70) {
            System.out.println("Predikat        : D");
            System.out.println("Keterangan      : Tidak Lulus");
        }
        }
    }
}
