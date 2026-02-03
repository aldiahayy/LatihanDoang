import java.util.Scanner;
public class no35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka = 1;
        int total = 0;
        while(angka != 0){
            angka = sc.nextInt();
            total += angka;
        }
        System.out.println("Total jumlah : " + total);
    }
}
