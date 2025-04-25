package Begum;

public class Week01_reversString {

    public static void main(String[] args) {

        oddOrEven(241);
        oddOrEven(21);
        oddOrEven(541);


    }
    public static void oddOrEven(int num){
        if (num%2==0){
            System.out.println(num+" is a even number");
        }else if (num%2==1){
            System.out.println(num+" is a odd number");
        }else {
            System.out.println(num+" is a zero");
        }
    }

}
