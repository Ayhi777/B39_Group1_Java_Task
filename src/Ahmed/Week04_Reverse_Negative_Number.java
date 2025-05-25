package Ahmed;

public class Week04_Reverse_Negative_Number {

    public static void main(String[] args) {
        int result = reverseNegativeNumber(-125);
        System.out.println("result = " + result);
    }

    public static int reverseNegativeNumber(int number) {
        boolean isNegative = number < 0;
        if (!isNegative) return number;

        String numberStr = String.valueOf(Math.abs(number));
        String reversedStr = "";

        for (int i = numberStr.length() - 1; i >= 0; i--) {
            reversedStr += numberStr.charAt(i);
        }

        int reversedNumber = Integer.parseInt(reversedStr);

        return -reversedNumber;
    }


}
