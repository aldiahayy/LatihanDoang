import java.util.Scanner;
public class no1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan jumlah nilai: ");
        int nilai [] = new int[sc.nextInt()];
        double total = 0;
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukan nilai ke-"+(i+1)+": ");
            nilai [i]= sc.nextInt();
            total+=nilai[i];
        }
        System.out.println("Rata-rata: " +((double)total/nilai.length));
    }
}
