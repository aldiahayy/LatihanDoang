package LatihanISC;
public class soal2 {
    public static void main(String[] args) {
        /*Bayangkan Kamu sedang membuat sebuah game sederhana. Karakter game Kamu bergerak di dunia dengan koordinat presisi tinggi (tipe double). Namun, layar game itu sendiri adalah sebuah grid atau petak-petak yang direpresentasikan dengan koordinat bilangan bulat (int).
Tugas Kamu adalah menentukan di petak grid (int) mana karakter Kamu berada saat ini.

Berikut adalah instruksinya

Buat sebuah program Java.
Di dalam main, buat dua variabel double untuk menyimpan posisi presisi karakter Kamu:
Double posisiX = 15.85;
Double posisiY = 9.25;
Lakukan narrowing casting untuk mengubah kedua posisi double tersebut menjadi koordinat grid. Simpan hasilnya dalam dua variabel int: gridX dan gridY.
Cetak posisi asli (double) dan posisi grid hasil casting (int) untuk memperlihatkan perbedaannya.

Setelah mencetak hasil, lanjutkan program Kamu untuk menjawab pertanyaan berikut menggunakan if-else:
Sebuah item “Kunci” ada di petak grid (15, 9).
Berdasarkan hasil casting gridX dan gridY Kamu, buatlah sebuah logika if-else untuk menentukan apakah karakter Kamu berhasil mengambil “Kunci” tersebut atau tidak.
Cetak hasilnya ke layar, misalnya “Karakter berhasil mengambil Kunci!” atau “Karakter gagal mengambil Kunci.”.*/
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
