package Murat;

public class Week10_FindMinimumInArray {


    public static void main(String[] args) {
        int[] array = {3, 5, 1, 4, 2};
        int min = findMin(array);
        System.out.println("Minimum value in the array: " + min);


        int [] array2 = {10, 20, 5, 5, 15};
        int min2 = findMin(array2);
        System.out.println("Minimum value in the second array: " + min2);

        int[] array3 = {7, 8, 9, 1, 2, -3};
        int min3 = findMin(array3);
        System.out.println("Minimum value in the third array: " + min3);

        // Additional test cases

        int[] nullArray = null;
        int minNull = findMin(nullArray);
        System.out.println("Minimum value in the null array: " + minNull);

        int[] emptyArray = {};
        int minEmpty = findMin(emptyArray);
        System.out.println("Minimum value in the empty array: " + minEmpty);
    }

    public static int findMin(int[] array){
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        int min = array[0]; // Assume the first element is the minimum
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i]; // Update min if a smaller element is found
            }
        }
        return min; // Return the minimum value found

    }

    }



/*
 Array -- Find Minimum
Write a method that can find the minimum
number from an int Array
 */
