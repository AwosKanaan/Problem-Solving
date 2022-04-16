package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    createArray(6,5,2);
        double[] arr = {2.5, 4.0, 5.5, 7.0, 8.5, 10.0};
        reversePart(arr,0,5);
        addNumbers(arr,3.1, 3.7, 4.9, 9.2);
    }

    //First method (Third parameter specifies the increment to be applied to obtain each element in the array).
    public static double[] createArray(int size, double index1, double increment) {
         double[] arr = new double[size];
        arr[0] = index1;

        for (int i = 0; i < arr.length - 1; i++) {
            double sum =  index1 + increment * (i + 1);
            arr[i + 1] += sum;
        }
        return arr;
    }

    //Second method (Reversing part of an array).
    public static double[] reversePart(double[] arr ,int num1, int num2) {
        if (num1 < 0 || num2 < 0 || num1 > arr.length - 1 || num2 > arr.length - 1 || num2 <= num1) {
            System.err.println("Invalid input.");
            return arr;
        }

        double temp = 0;

        while (num1 < num2) {
            temp = arr[num1];
            arr[num1] = arr[num2];
            arr[num2] = temp;
            num1 += 1;
            num2 -= 1;
        }
        return arr;
    }

    // Third method ().
    public static double[] addNumbers(double[] arr, double ... list) {
        boolean ascendingOrder = true;
        double[] array = new double[list.length + arr.length];

        // Copy elements of arr.
        for (int i = 0; i < arr.length; i++) {
            array[i] = arr[i];
        }

        // checking if the given array isn't ascendingly sorted, if so we're adding elements of "list" to very end.
        for (int i = 0; i < arr.length - 1 && ascendingOrder; i++) {
            if (arr[i] > arr[i + 1]) {
                ascendingOrder = false;
                int temp1 = 0;
                for (int j = arr.length; j < list.length + arr.length; j++) {
                    array[j] = list[temp1];
                    ++temp1;
                }
                return array;
            }
        }

        /* Otherwise, the array is ascendingly ordered so, * first: we put all elements without sorting.
           * Then we sort and return the sorted array.
        */

        int temp1 = 0;
        for (int i = arr.length; i < (list.length + arr.length); i++) {
            array[i] = list[temp1];
            ++temp1;
        }

        Arrays.sort(array);

        return array;
    }

    //Fourth method.
    public static double[] arrayGreaterThan(double[] arr, double arg) {
        double[] newArr = new double[arr.length];

        for (int i = 0; i < newArr.length; i++) {
            if (arr[i] > arg) {
                newArr[i] = arr[i];
            }
        }
        //test for ensuring we got the right value.
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + "\t");
        }
        return newArr;
    }
}
