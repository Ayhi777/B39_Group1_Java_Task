package Halime;

import static Halime.Week_UniqueChar.UniqueCharacters.unique;

public class Week_UniqueChar {
    public static void main(String[] args) {
        String input = "AAABBBCCCDEF";
        System.out.println("Unique characters: " + unique(input)); // DEF


    }

    public class UniqueCharacters {

        public static String unique(String str) {
            String result = "";

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                // Eğer karakterin sadece 1 tane olduğunu kontrol et
                if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                    result += ch;
                }
            }

            return result;
        }


    }
}