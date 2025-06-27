package Murat;

public class Week08_Reverse_String {

    public static void main(String[] args) {

       String reversedString = reverse("ABCD");
        System.out.println("reversedString = " + reversedString);

        String r1 = reverse("ABCDCBA");
        System.out.println("r1 = " + r1);

        String r2 = reverse("KLM!?%");
        System.out.println("r2 = " + r2);

        String r3 = reverse("RT");
        System.out.println("r3 = " + r3);

        String r4 = reverse("group 1 batch 39");
        System.out.println("r3 = " + r4);


    }

    public static String reverse(String str) {
        StringBuilder reversedStr = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr.append(str.charAt(i));
        }
        return reversedStr.toString();
    }
}
/*
String -- Reverse
Write a return method that can reverse  String
Ex: Reverse("ABCD"); ==> DCBA
 */