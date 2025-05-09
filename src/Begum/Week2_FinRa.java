package Begum;

public class Week2_FinRa {

    public static void main(String[] args) {
        printFinRa(1, 30);
        printFinRa(5, 25);

    }


    public static void printFinRa(int num1, int num2) {
        while (num1 <= num2) {
            if (num1 % 15 == 0) {
                System.out.print(" FinRa ");
            } else if (num1 % 5 == 0) {
                System.out.print(" Ra ");
            } else if (num1 % 3 == 0) {
                System.out.print(" Fin ");
            } else {
                System.out.print(" " + num1);
            }
            num1++;
        }
        System.out.println();
    }
}
