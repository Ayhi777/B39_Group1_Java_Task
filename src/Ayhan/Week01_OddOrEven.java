package Ayhan;

public class Week01_OddOrEven {

    public static void main(String[] args) {
    oddOrEven(20);
    oddOrEven(21);
    oddOrEven(0);
    }
    public static void oddOrEven(int num){
        if (num % 2 == 0){
            System.out.println(num + " is a Even Number.");
        }else if (num % 2 == 1){
            System.out.println(num + " is Odd number.");
        } else {
            System.out.println(num + " is zero.");
        }
    }

}
