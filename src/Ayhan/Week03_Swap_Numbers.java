package Ayhan;

public class Week03_Swap_Numbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a + ", b = " + b);

        }
    }

