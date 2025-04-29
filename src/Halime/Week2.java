package Halime;

public class Week2 {
    public static void main(String[] args) {

        String str = "apple";

        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            reversed += str.charAt(i);

        }
        System.out.println(reversed);
    }

}
