import java.util.Scanner;
public class no28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan angka: ");
        float angka = sc.nextFloat();
        
        if (angka%1==0) {
            System.out.println("Bilangan Bulat");
        }else{
            System.out.println("Bilangan Desimal");
        }
    }
}
