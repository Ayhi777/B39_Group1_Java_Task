package Halime;

public class Week2_FinRa {
    public static void main(String[] args) {
        printFinRa(1, 33);

    }


    public static void printFinRa(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 15 == 0) {
                System.out.println("FinRa");
            } else if (i % 3 == 0) {
                System.out.println("Fin");
            } else if (i % 5 == 0) {
                System.out.println("Ra");
            } else {
                System.out.println(i);
            }
        }
    }
}



