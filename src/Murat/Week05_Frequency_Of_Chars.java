package Murat;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;


public class Week05_Frequency_Of_Chars {


    public static void main(String[] args) {

        System.out.println(frequencyOfChars("ABBACDDA"));

    }

    public static String frequencyOfChars(String input) {
        Map<Character, Integer> counter = new LinkedHashMap<>();

        // counting frequency of each character
        for (char c : input.toCharArray()) {
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }

        // creating result
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : counter.entrySet()) {
            result.append(entry.getKey()).append(entry.getValue());
        }

        return result.toString();
    }


}





/*
1.    String -- Frequency of Characters
Write a return method that can find the frequency of characters
Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */