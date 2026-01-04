import java.util.Scanner;
public class no6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama[] = {"rifky","rajab","daud","rendi","hanip","parma","azisah","hasnur","ali","ade"};
        System.out.print("Nama: ");
        for (int i = 0; i < nama.length; i++) {
            System.out.print(nama[i]+" ");
        }
        System.out.println("");
        System.out.print("Cari: ");
        String cari = sc.nextLine();
        for (int i = 0; i < nama.length; i++) {
            if (cari.equalsIgnoreCase(nama[i])) {
                System.out.println(cari + " ditemukan di index ke-" + i);
            }
        }
    }
}
