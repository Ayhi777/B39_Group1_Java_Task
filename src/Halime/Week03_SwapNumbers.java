package Halime;

public class Week03_SwapNumbers {

    public static void main(String[] args) {


        /*
        SWAP NUMBERS
        Swap 2 numbers without creating a 3rd variable
         */
        int a = 5;
        int b = 10;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("a = " + a); // 10
        System.out.println("b = " + b); // 5

    }

}
