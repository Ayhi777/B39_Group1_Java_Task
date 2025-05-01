package Ayhan;

public class Week02 {

    public static void main(String[] args) {
        for(int i = 1; i <= 30; i++){
            System.out.print(finra(i) + " ");
        }
    }
    public static String finra(int num){
        if(num % 3 == 0 && num % 5 == 0){
            return "FINRA";
        }else if(num % 3 == 0){
            return "FIN";
        }else if(num % 5 == 0){
            return "RA";
        }else{
            return String.valueOf(num);
        }
    }
}
  
