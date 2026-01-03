/*Buatlah program yang dapat menampung minimal 5 nama dalam sebuah array. Setelah mendeklarasikan dan menginisialisasi
array maka tampilkan isi dari array tersebut lalu setelah di tampilkan update 2 index
pada array tersebut (bebas index keberapa) lalu tampilkan kembali.

Output : 
Before : rifky rajab daud rendi hanip
After : rifky hasnur daud ali hanip
note : mengubah isi array pada index ke-1 dan ke-3

Output : 
Before : rifky rajab daud rendi hanip
Before : hanip rajab daud rendi rifky
note : mengubah isi array pada index ke-0 dan ke-4*/
public class no5 {
    public static void main(String[] args) {
        String nama [] = {"rifky", "rajab", "daud","rendi","hanif"};
        for (String baru : nama) {
            System.out.print("before: "+baru+" ");
        }
        System.out.println("");
        nama[1] = "hasnur";
        nama[3] = "ali";
        for (String baru : nama) {
            System.out.print("after: "+baru+" ");
        }
    }
}
