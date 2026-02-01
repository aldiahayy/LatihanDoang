import java.util.Scanner;
public class no32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;
        int total = 0;
        do{
            angka = sc.nextInt();
            total += angka;
        }while(!(total > 50 || total < 0));
        System.out.println("stack overflow!");
    }
}
