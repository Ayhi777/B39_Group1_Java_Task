package Begum;

public class Week010_FindMinimumArray {
    /*
     Write a method that can find the minimum number from an int Array
     */


    public static void main(String[] args) {
        int[] arrayList = {-10, 8, 9, 1, 2, -3};
        int[] arrayList1 = {};

        int minValue= findMin(arrayList);
        System.out.println("Minimum value in the third array: " + minValue);
    }

    public static int findMin(int array[]){
        try {
            int min = Integer.MAX_VALUE; // Assume the first element is the minimum
            for (int i = 0; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i]; // Update min if a smaller element is found
                }
            }
            return min;
        } catch (Exception e) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
    }

}
