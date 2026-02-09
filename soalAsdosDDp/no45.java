import java.util.Scanner;
public class no45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("CPU: ");
        int cpu = sc.nextInt();
        System.out.print("RAM: ");
        int ram = sc.nextInt();
        System.out.print("Suhu: ");
        int suhu = sc.nextInt();
        
        boolean kritis = (cpu > 90) || (ram > 90) || (suhu > 90);
        boolean tinggi = (cpu >= 70 && cpu <= 90) && (ram >= 70 && ram <= 90) && (suhu >= 70 && suhu <= 90);
        boolean normal = (cpu < 70) && (ram < 70) && (suhu < 70);
        
        if (kritis == true) {
            System.out.println("Kritis");
        }else if (tinggi == true) {
            System.out.println("Tinggi");
        }else if (normal == true) {
            System.out.println("Normal");
        }else{
            System.out.println("Waspada");
        }
    }
}
