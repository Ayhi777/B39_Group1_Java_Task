package Halime;

public class week08ReversString {

    /*
    String -- Reverse
Write a return method that can reverse  String
Ex: Reverse("ABCD"); ==> DCBA
     */


    public static void main(String[] args) {


        System.out.println(reverse("halime"));


    }


    public static String reverse(String str) {
        StringBuilder reverseSb = new StringBuilder(str); // str'yi ekledik
        reverseSb.reverse(); // ters çevirdik
        return reverseSb.toString(); // string olarak geri döndürdük
    }


}