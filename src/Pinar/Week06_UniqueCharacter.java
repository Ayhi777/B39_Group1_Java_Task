package Pinar;

import java.util.LinkedHashMap;
import java.util.Map;



public class Week06_UniqueCharacter {
    public static String unique(String str) {
        Map<Character, Integer> charCount = new LinkedHashMap<>();
        for (char ch : str.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                result.append(entry.getKey());
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(unique("AAABBBCCCDEF"));  // Output: DEF
    }
}

