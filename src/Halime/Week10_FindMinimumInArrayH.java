package Halime;

import java.util.Arrays;

public class Week10_FindMinimumInArrayH {
/*
 Array -- Find Minimum
Write a method that can find the minimum
number from an int Array
 */

    public static void main(String[] args) {
        int[] list = {2, 3, -5, 6, 8, 90};
        int[] list1 = {};
        int numberMin1 = findMin(list);
        System.out.println("numberMin1 = " + numberMin1);

        int numberMin = findMin(list1);

        // int numMin = FindMinValue(list1);


        System.out.println("numberMin = " + numberMin);

        // System.out.println("numMin = " + numMin);
    }

    public static int findMin(int[] num) {
        try {
            Arrays.sort(num);


            return num[0];
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

  /*  public static int FindMinValue(int[] num) {

        {
            if (num == null || num.length - 1 == 0) {

                throw new IllegalArgumentException("Array cannot be null or empty");
            }
        }

        try {
            int max = Integer.MAX_VALUE;
            for (int each : num) {
                if (each < max)
                    max = each;
            }
            return max;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }




    }

   */
}



