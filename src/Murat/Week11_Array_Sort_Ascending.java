package Murat;

import java.util.Arrays;

public class Week11_Array_Sort_Ascending {
    /*
        10.    Array -- Sort Ascending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex:
            int[] arr = {10, 9, 8, 7};
             arr = Sort(arr);         ==>{ 7, 8, 9, 10};

     */
    public static void main(String[] args) {
        // example 1
        int[] arr = {10, 9, 8, 7};
        int[] sortedArr = sortAscending(arr);
        System.out.println(Arrays.toString(sortedArr));

        // example 2
        int[] arr2 = {3, 5, 1, 4, 2};
        int[] sortedArr2 = sortAscending(arr2);
        System.out.println(Arrays.toString(sortedArr2));
        // example 3
        int[] arr3 = null;
        int[] sortedArr3 = sortAscending(arr3);
        System.out.println(Arrays.toString(sortedArr3)); // Should print null

        // example 4
        int[] arr4 = {};
        int[] sortedArr4 = sortAscending(arr4);
        System.out.println(Arrays.toString(sortedArr4)); // Should print []
    }

    public static int[] sortAscending(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array cannot be null or empty");
            return arr; // Return the array as is if it's null or empty
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    // Swap arr[i] and arr[j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr; // Return the sorted array
    }
}
