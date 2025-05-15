package Murat;

public class Week04_Reverse_Negative_Int {
    public static void main(String[] args) {
        System.out.println(reverseNegativeNumber(-125));
    }

    public static int reverseNegativeNumber(int num1){

        String num1String = String.valueOf(num1);
        String num2String = "-";
        for(int i = num1String.length()-1; i >= 1; i--){
            num2String += num1String.charAt(i);
        }
        return Integer.parseInt(num2String);

    }
}
/*
Number -- Reverse negative number
Write a return method that can reverse negative number and return it as int

Sample: number= -125
        result= -521
 */

