package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter size of the array: ");
        int count = scan.nextInt();

        int [] returnedArray = readIntegers(count);
        findMin(returnedArray);

    }

    public static int [] readIntegers(int count) {
        int arr [] = new int[count];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter number " + i + " in the array: ");
            arr[i] = scan.nextInt();
        }

        return arr;
    }

    public static int findMin(int [] array) {
        int min = array[0];

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] < min) {
                min = array[i + 1];
            }
        }
        System.out.println(min);
        return min;
    }
}
