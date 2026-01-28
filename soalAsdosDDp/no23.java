public class no23 {
    public static void main(String[] args) {
        System.out.println(kelilingPersegi1(8)+" cm");
        kelilingPersegi2(8);
        
        no23 no23 = new no23();
        System.out.println(no23.kelilingPersegi3(8)+" cm");
    }
    public static int kelilingPersegi1(int sisi){
     return 4*sisi;   
    }
    public static void kelilingPersegi2(int sisi){
        System.out.println((4*sisi)+" cm");
    }
    int kelilingPersegi3(int sisi){
        return 4*sisi;
    }
}
