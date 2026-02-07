import java.util.Scanner;
public class no42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan jam (0-23): ");
        int jam = sc.nextInt();
        String pesan = "";
        
        if (jam >= 18 && jam <= 23) {
            pesan = "Malam";
        }else if (jam >= 12) {
            pesan = "Siang";
        }else if (jam >= 0) {
            pesan = "Pagi";
        }else{
            pesan = "Jam yang anda masukan tidak valid";
        }
        System.out.println(pesan);
    }   
}
