package Pinar;

public class Week03_Swap_Numbers {
    public static void main(String[] args) {
        int firstNumber = 12;
        int secondNumber = 45;


        int tempValue = firstNumber;
        firstNumber = secondNumber;
        secondNumber = tempValue;

        System.out.println("first number = " + firstNumber + ",second number = " + secondNumber);


    }
}
