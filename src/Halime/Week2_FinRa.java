package Halime;

public class Week2_FinRa {
    public static void main(String[] args) {
        printFinRa(1, 30);

    }


    public static void printFinRa(int num1, int num2) {
        for (int i = 1; i <= 30; i++) {
            if (i % 15 == 0) {
                System.out.print("FinRa" + " ");
            } else if (i % 3 == 0) {
                System.out.print("Fin" + " ");
            } else if (i % 5 == 0) {
                System.out.print("Ra" + " ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}



