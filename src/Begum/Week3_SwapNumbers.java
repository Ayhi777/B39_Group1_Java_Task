package Begum;

public class Week3_SwapNumbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 9;

        System.out.println("Önce - a: " + a + ", b: " + b);

        // Swap işlemi
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Sonra - a: " + a + ", b: " + b);
    }
}
