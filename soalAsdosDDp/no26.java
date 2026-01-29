import java.util.Scanner;
public class no26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float angka1 = sc.nextFloat();
        float angka2 = sc.nextFloat();
        float bagi = angka1/angka2;
        
        if (bagi%1==0) {
            System.out.println("Bulatt");
            System.out.println((int)bagi);
        }else{
            System.out.println("Pecahann");
            System.out.println(bagi);
        }
    }   
}
