package Halime;

import java.util.ArrayList;

public class Week05_FrequencyOfCharacters {


    /*
    String -- Frequency of Characters
Write a return method that can find the frequency of characters
Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */

    public static void main(String[] args) {
        String input = "AAABBCDD";
        String result = frequencyOfCharacters(input);
        System.out.println("Sonuç: " + result);  // Çıktı: A3B2C1D2
    }

    public static String frequencyOfCharacters(String str) {

        StringBuilder result = new StringBuilder();
        ArrayList<Character> checkedChars = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            // Daha önce bu harfi saydıysak geç
            if (checkedChars.contains(currentChar)) {
                continue;
            }

            int count = 0;

            // Bu harfin kaç kez geçtiğini say
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == currentChar) {
                    count++;
                }
            }

            // Sonucu oluştur
            result.append(currentChar).append(count);
            checkedChars.add(currentChar);  // Bu harfi tekrar saymamak için ekle
        }

        return result.toString();


    }
}