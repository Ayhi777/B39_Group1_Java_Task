package Pinar;

public class Week02_Finra {

    public static void main(String[] args) {
        writeFinra(1, 20);
        System.out.println();
        finra2(30);
    }

    public static void writeFinra(int start, int end) {
        while (start <= end) {
            if (start % 3 == 0 && start % 5 == 0) {
                System.out.print(" FINRA ");
            } else if (start % 3 == 0) {
                System.out.print(" FIN ");
            } else if (start % 5 == 0) {
                System.out.print(" RA ");
            } else {
                System.out.print(" " + start + " ");
            }
            start++;
        }
    }

    public static void finra2(int num) {
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(" FINRA ");
            } else if (i % 3 == 0) {
                System.out.print(" FIN ");
            } else if (i % 5 == 0) {
                System.out.print(" RA ");
            } else {
                System.out.print(" " + i + " ");
            }
        }

    }
}


