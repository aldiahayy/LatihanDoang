import java.util.Scanner;
public class no44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan kualitas download: ");
        int download = sc.nextInt();
        System.out.print("Masukan kualitas upload: ");
        int upload = sc.nextInt();
        System.out.print("Masukan ping: ");
        int ping = sc.nextInt();
        String pesan = "";
        
        if (download > 50 && upload > 10 && ping < 30) {
            pesan = "Sangat Baik";
        }else if (download > 20 && upload > 5 && ping < 50) {
            pesan = "Cukup";
        }else if (download < 10 || ping > 100) {
            pesan = "Buruk";
        }else{
            pesan = "Biasa";
        }
        System.out.println("Kualitas : " + pesan);
    }
}
