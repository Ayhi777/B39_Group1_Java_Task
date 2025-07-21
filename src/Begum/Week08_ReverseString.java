package Begum;

public class Week08_ReverseString {
    //String -- Reverse
    //Write a return method that can reverse  String
    //Ex: Reverse("ABCD"); ==> DCBA

    public static void main(String[] args) {
        System.out.println(reverse("begum"));

    }


    public static String reverse(String string){
        StringBuilder sb = new StringBuilder(string);
        sb.reverse();
        return sb.toString();
    }
}
