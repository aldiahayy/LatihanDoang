package LatihanISC;
import java.util.Scanner;
public class soal10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = "aldi";
        String password = "123m";
        System.out.print("Masukkan username : ");
        String us = sc.nextLine();
        System.out.print("Masukkan password : ");
        String pw = sc.nextLine();

        if (us.equals(username)) {
            if (pw.equals(password)) {
                for (int i = 1; i <= 100; i++) {
                    if (i % 2 == 0) {
                        System.out.println(i);
                    }
                }
            } else {
                System.out.println("password salah");
            }
        } else {
            if (pw.equals(password)) {
                System.out.println("username salah");
            } else {
                for (int i = 1; i <= 100; i+=2) {
                    System.out.println(i);
                }
            }
        }
    }
}
