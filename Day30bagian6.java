package evaluasiDoang;

import java.util.Scanner;
/*Buatkan saya sebuah program yang meminta inputan usernamee dan passsword dengan ketentuan:

1. Jika username benar dan password salah, maka output ("username salah")

2. Jika username salah dan password benar, maka output ("password salah")

3. Jika salah semua (cetak angka ganjil 1-100)

4. Jika benar semua (cetak angka genap 1-100)

*/
public class soal8 {

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
                for (int i = 2; i <= 100; i += 2) {
                    System.out.println(i);
                }
            } else {
                System.out.println("password salah");
            }

        } else {
            if (pw.equals(password)) {
                System.out.println("username salah");

            } else {
                for (int i = 1; i <= 100; i += 2) {
                    System.out.println(i);

                }
            }
        }

    }

}
