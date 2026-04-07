package LatihanISC;
import java.util.Scanner;
public class no19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String u = "admin";
        String p = "12345";
        boolean t = false;
        for (int i = 1; i <= 3; i++) {
            String a = sc.nextLine();
            String b = sc.nextLine();

            if (a.equals(u) && b.equals(p)) {
                t = true;
                break;
            }
        }
      
        if (t) {
            System.out.println("LOGIN BERHASIL");
        } else {
            System.out.println("AKUN TERKUNCI");
        }
      
    }
}
