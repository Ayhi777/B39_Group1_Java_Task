package Murat;

import java.util.ArrayList;

public class Week06_Remove_Duplicates {

    public static void main(String[] args) {

        System.out.println(removeDup("ABACAAADDDD"));

    }

   public static String removeDup(String str){
        ArrayList<Character> list = new ArrayList<>();
        String result= "";
        for(int i = 0; i < str.length(); i++){
            if(!list.contains(str.charAt(i))){
                list.add(str.charAt(i));
            }
        }
       for (int i = 0; i < list.size(); i++) {
           result += "" + list.get(i);
       }

        return result;
   }
}
/*
Remove Duplicates
Write a return method that can remove the duplicated values from String
Ex:  removeDup("AAABBBCCC")  ==> ABC

 */