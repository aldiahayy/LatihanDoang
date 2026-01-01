/*buat sebuah program untuk menampung nilai array sebanyak 10 dari pengguna kemudian tampilkan hanya angka genap di atas 50.
contoh input:
10
20
30
40
50
51
52
53
54
55

output:
52
54*/
import java.util.Scanner;
public class no2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilai[] = new int[10];
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukan nilai ke-"+(i+1)+": ");
            nilai [i]= sc.nextInt();
        }
        for (int i : nilai) {
            if (i % 2 == 0 && i > 50) {
                System.out.println(i); 
            }
        }
    }
}
