package Canan;

public class Week03_SwapNumber {
    public static void main(String[] args) {



                int firstNum = 7;
                int secondNum = 11;

                // Swap işlemi

                firstNum = firstNum + secondNum; //  7 + 11 = 18
                secondNum = firstNum - secondNum; // 18 - 11 = 7
                firstNum = firstNum - secondNum; // 18 - 7 = 11

                System.out.println("first number : " + firstNum + ", second number : " + secondNum);




    }
}



           /*
           Swap two numbers without creating 3rd  variable
            */