import java.util.Scanner;
public class no33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 5;
        int b = 2;
        double c = a;
        double d = b;
        System.out.print("Masukan operator (+ - / x %): ");
        char operator = sc.next().charAt(0);
        
        String hasil = "";
        if (operator == '+') {
            hasil = a + " + " + b + " = " + (a + b); 
        }else if (operator == '-') {
            hasil = a + " - " + b + " = " + (a - b);
        }else if (operator == '/') {
            hasil = a + " / " + b + " = " + (double)(c / d);
        }else if (operator == 'x') {
            hasil = a + " x " + b + " = " + (a * b);
        }else if (operator == '%') {
            hasil = a + " % " + b + " = " + (a % b);
        }else{
            hasil = "operator tidak ada";
        }
        System.out.println(hasil);
    }
}
