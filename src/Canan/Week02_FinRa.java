package Canan;

public class Week02_FinRa {
    public static void main(String[] args) {


        finRA();

    }

    public static void finRA(){
        for (int num = 1; num <=30; num++) {
            if(num %3 ==0 && num % 5 == 0) {
                System.out.print("FINRA");

            } else if (num % 5 == 0 ) {
                System.out.print("RA" + " ");

            } else if (num % 3 == 0) {
                System.out.print("FIN" + " ");

            }else {
                System.out.print(num + " ");
            }
        }
    }


}

             /*
             JAVA TASK OF THE WEEK #

FINRA :
Write a method which prints out the numbers from 1 to 30 but
if the number is a multiple of 3, print "FIN" instead of the number
and if the number is multiple of 5, print "RA" instead of the number.
If the number is a multiple of both 3 and 5, then print "FINRA" instead of the number.


Example:
1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA ...`
              */