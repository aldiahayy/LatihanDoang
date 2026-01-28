import java.util.Scanner;
public class no24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        no25 no25 = new no25();
        System.out.print("Masukan angka pertama: ");
        int a = sc.nextInt();
        System.out.print("Masukan angka kedua: ");
        int b = sc.nextInt();
        System.out.println(no25.jumlah(a,b));
    }
    int jumlah(int a, int b){
        return a + b;
    }
}
