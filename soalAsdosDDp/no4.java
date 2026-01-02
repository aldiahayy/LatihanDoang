/*Ali memiliki deretan angka di dalam array, yaitu
[23, 67, 23, 56,232, 876, 1], 
dia ingin mencari nilai terbesar dalam deretan angka tersebut. Bantulah Ali mencari nilai terbesar yang ada dalam array tersebut.
*/
import java.util.Scanner;
public class no4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka[] = {23,67,23,56,232,876,1};
        int max = angka[0];
        for (int i = 0; i < angka.length; i++) {
            if (angka[i]>max) {
                max = angka[i];
            }
        }
        System.out.println("nilai terbesar: " + max);
    }
}
