package Murat;

import java.util.LinkedHashMap;
import java.util.Map;

public class Week07_Find_The_Unique {


    public static void main(String[] args) {
      StringBuilder str =  unique("AAABBBCCCDEF");
      StringBuilder str_1 =  unique("AAABBBCCCDEF!");
      StringBuilder str_2 =  unique("AAABBBCCCDEF23233221");
      StringBuilder str_3 =  unique("ABBaaABCcCCDEeF2323322");
      System.out.println(str);
      System.out.println(str_1);
      System.out.println(str_2);
      System.out.println(str_3);
    }

    public static StringBuilder unique(String input){
        Map<Character, Integer> counter = new LinkedHashMap<>();//

        // counting frequency of each character
        for (char c : input.toCharArray()) {
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }

        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : counter.entrySet()) {
            if(entry.getValue() == 1){
                result.append(entry.getKey());
            }
        }

        return result;
    }
}
/*
Find the unique
Write a return  method that can find the unique characters from the String
Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
 */