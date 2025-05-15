package Pinar;

public class Week04_Reverse_Negatif_Number {
    public static void main(String[] args) {
        int input = -125;
        int result = reverseNegativeNumber(input);
        System.out.println("Ters çevrilmiş hali: " + result);
    }

    public static int reverseNegativeNumber(int input) {
        if (input >= 0) {
            System.out.println("Bu metot sadece negatif sayılar içindir.");
            return input;
        }

        int positiveVersion = -input; // negatif sayıyı pozitife çevirme
        String reversedString = new StringBuilder(String.valueOf(positiveVersion)).reverse().toString();
        int reversedNumber = Integer.parseInt(reversedString);

        return -reversedNumber; // tekrar negatif hale getirip döndür
    }
}





