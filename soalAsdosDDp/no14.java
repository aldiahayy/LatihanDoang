import java.util.Scanner;
public class no14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan nama: ");
        String nama = sc.nextLine();
        System.out.print("Masukan jurusan: ");
        String jurusan = sc.nextLine();
        
        System.out.println("Halo " + nama + ", kamu dari jurusan " + jurusan);
    }
}
