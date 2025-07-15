package Begum;

public class Week4_ReverseNegativeNumber {
    public static void main(String[] args) {
        int negativeNumber = -123 ;

        System.out.println("Ters (pozitif): " + reverseInt(negativeNumber));
    }
    public static int reverseInt(int number) {

        boolean isNegativeNumber = number < 0;

        // Sayıyı pozitif hale getir, stringe çevir ve ters çevir
        String numStr = Integer.toString(Math.abs(number));
        String reversedStr = new StringBuilder(numStr).reverse().toString();

        //sayiyi tekrar stringden integera ceviriyorum
        int reversedNumber = Integer.valueOf(reversedStr).intValue();

        if (isNegativeNumber) {
            return -reversedNumber;
        } else {
            return reversedNumber;
        }
    }
}
