package Begum;

import java.util.ArrayList;

public class Week05_Frequency_Of_Char {
    //1.    String -- Frequency of Characters
    //Write a return method that can find the frequency of characters
    //Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

    public static void main(String[] args) {
        System.out.println(frequencyOfChars("aaaabbbbbcccccdddddddddd"));
    }

    public static String frequencyOfChars(String str) {
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
            checkedChars.add(currentChar);// Bu harfi tekrar saymamak için ekle
            result.append(currentChar).append(count);
        }

        return result.toString();
    }



}

