import java.util.Scanner;
public class no11 {
    public static void main(String[] args) {
        no11 object = new no11();
        object.faktorial(0);
    }
    public int faktorial(int angka){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan angka: ");
        angka = sc.nextInt();
        int total = 1;
        for (int i = 1; i <= angka; i++) {
            total *= i;
        }
        System.out.println("faktorial dari " + angka +" adalah " + total);
        return total;
    }
}
