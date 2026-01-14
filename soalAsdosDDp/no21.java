import java.util.Scanner;
public class no21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan 3 deret angka: ");
        int angka1 = sc.nextInt();
        int angka2 = sc.nextInt();
        int angka3 = sc.nextInt();
        
        System.out.println("Angka : " + angka1 +", " + angka2 +", " + angka3);
        if (angka2 > angka1){
            System.out.println("Selisih pertama = " + (angka2 - angka1));
        }else if (angka1 > angka2) {
            System.out.println("Selisih pertama = " + (angka1 - angka2));
        } else{
            System.out.println("Selisih pertama = angka sama");
        }
        
        if (angka3 > angka2){
            System.out.println("Selisih kedua = " + (angka3 - angka2));
        }else if (angka2 > angka3) {
            System.out.println("Selisih kedua = " + (angka2 - angka3));
        } else{
            System.out.println("Selisih kedua = angka sama");
        }
    }
}
