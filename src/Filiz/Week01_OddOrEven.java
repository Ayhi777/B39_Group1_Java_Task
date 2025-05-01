package Filiz;

public class Week01_OddOrEven {

    public static void main(String[] args) {

        oddOrEven(241);
        oddOrEven(21);
        oddOrEven(541);
        oddOrEven(0);
        oddOrEven(-21);


    }
    public static void oddOrEven(int num){
        if (num==0){
            System.out.println(num+" is a zero");
        }else if (num%2==0){
            System.out.println(num+" is a even number");

        }else {
            System.out.println(num+" is a odd number");
        }
    }

}
