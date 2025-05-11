package Filiz;
/*
SWAP NUMBERS
Swap 2 numbers without creating a 3rd variable
 */
public class Week03_SwapNumbers {
    public static void main(String[] args) {
        int number1=10;
        int number2=20;

        number1=number1+number2; //30
        number2=number1-number2;//10;
        number1=number1-number2;//20

        System.out.println("number1 = " + number1);
        System.out.println("number2 = " + number2);


    }
}
