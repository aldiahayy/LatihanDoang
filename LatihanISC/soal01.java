package LatihanISC;
public class soal01 {
    public static void main(String[] args) {
        short roti = 16500;
        int susu = 65000;
        int beras = 55000;
        int minyak = 43500;
        int frozen = 20000 * 6;
        float pajak = 0.1f;
      
        int totalBelanja = roti + susu + beras + minyak + frozen;
        float pajaknya = totalBelanja * pajak;
        float harganya = totalBelanja + pajaknya;
      
        System.out.println("Total harga : " + harganya);
        System.out.println("Total harga : " + (totalBelanja + pajaknya));   
    }   
}
