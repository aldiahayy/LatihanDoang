import java.util.Scanner;
public class no9 {
    public static void main(String[] args) {
        System.out.println(hitungLuas(0,0));
    }
    public static double hitungLuas(double panjang, double lebar){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan panjang: ");
        panjang = sc.nextDouble();
        System.out.print("Masukan lebar: ");
        lebar = sc.nextDouble();
        return panjang*lebar;
    } 
}
