import java.util.Scanner;
public class no15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Nama Lengkap: ");
        String nama = sc.nextLine();
        System.out.print("Masukan Usia: ");
        int usia = sc.nextInt();
        System.out.print("Masukan Jenis Kelamin L/P: ");
        char jenisKelamin = sc.next().charAt(0);
        System.out.print("Masukan Tinggi Badan (cm): ");
        double tinggiBadan = sc.nextDouble();
        System.out.print("Apakah anda sudah menikah: ");
        boolean status = sc.nextBoolean();
        
        System.out.println("Formulir pendaftaran");
        System.out.println("=======================");
        System.out.println("Nama Lengkap  : " + nama);
        System.out.println("Usia          : " + usia);
        System.out.println("Jenis kelamin : " + jenisKelamin);
        System.out.println("Tinggi badan  : " + tinggiBadan + " cm");
        System.out.println("Status        : " + status);
        System.out.println("=======================");
    }
}
