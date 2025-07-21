package Halime;


import java.util.ArrayList;

public class Week06_RemoveDuplicates {
/*
Remove Duplicates
Write a return method that can remove the duplicated values from String
Ex:  removeDup("AAABBBCCC")  ==> ABC
 */

    public static void main(String[] args) {

        System.out.println(removeDuplicate("ERYHGHOKIOLUGGTYYUUUOO"));


    }

    public static String removeDuplicate(String str) {
        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if (!list.contains(str.charAt(i))) {
                list.add(str.charAt(i));
            }
        }


        return list.toString();
    }

}
