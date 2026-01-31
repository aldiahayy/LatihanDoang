import java.util.Scanner;
public class no30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan sisi A: ");
        int sisiA = sc.nextInt();
        System.out.print("Masukan sisi B: ");
        int sisiB = sc.nextInt();
        System.out.print("Masukan sisi C: ");
        int sisiC = sc.nextInt();
        
        if (sisiA == sisiB && sisiB == sisiC) {
            System.out.println("Jenis Segitiga : sama sisi");
        }else if (sisiA == sisiB || sisiB == sisiC || sisiA == sisiC) {
            System.out.println("Jenis Segitiga : sama kaki");
        }else{
            System.out.println("Jenis Segitiga : sembarang");
        }
    }
}
