public class no7 {
    public static void main(String[] args) {
        byte a [] = {10,20,30,40,50};
        short b [] = {1000,2000,3000,4000,5000};
        int c [] = {1,2,3,4,5};
        long d [] = {10000,20000,30000,40000,50000};
        float e [] = {1.1f,2.2f,3.3f,4.4f,5.5f};
        double f [] = {10.5,20.5,30.5,40.5,50.5};
        char g [] = {'L','U','L','U','S'};
        String h [] = {"Semoga","lulus","mata","kuliah","DDP"};
        
        System.out.println("\nArray byte:");
        for (byte i : a) {
            System.out.print(i+" ");
        }
        System.out.println("\nArray short:");
        for (short s : b) {
            System.out.print(s+" ");
        }
        System.out.println("\nArray int:");
        for (int i : c) {
            System.out.print(i+" ");
        }
        System.out.println("\nArray long:");
        for (long l : d) {
            System.out.print(l+" ");
        }
        System.out.println("\nArray float:");
        for (float i : e) {
            System.out.print(i+" ");
        }
        System.out.println("\nArray double:");
        for (double i : f) {
            System.out.print(i+" ");
        }
        System.out.println("\nArray char:");
        for (char i : g) {
            System.out.print(i+" ");
        }
        System.out.println("\nArray String:");
        for (String string : h) {
            System.out.print(string+" ");
        }
    }
}
