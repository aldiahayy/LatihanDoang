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
