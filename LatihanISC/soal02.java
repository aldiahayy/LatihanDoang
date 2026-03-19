package LatihanISC;
public class soal02 {
    public static void main(String[] args) {
        double posisiX = 15.85;
        double posisiY = 9.25;
        
        int gridX = (int)posisiX;
        int gridY = (int)posisiY;
        
        System.out.println("Posisi koordinat sebelum narrowing casting yaitu " + posisiX + ", " + posisiY);
        System.out.println("Posisi koordinat setelah narrowing casting yaitu " + gridX + ", " + gridY);
        
        int gridKunciX = 15;
        int gridKunciY = 9;
        
        if(gridX == gridKunciX && gridY == gridKunciY){
            System.out.println("Karakter berhasil mengambil kunci!");
        }else{
            System.out.println("Karakter gagal mengambil kunci.");
        }
    }
}
