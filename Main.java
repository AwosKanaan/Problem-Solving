package com.company;

import java.util.Scanner;

public class Main
{
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myArray = getIntegers(5);
        printArray(sortIntegers(myArray));

    }

    public static int[] getIntegers(int number) {
        int[] array = new int[number];

        System.out.println("Enter " + array.length + " Elements:");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        return array;
    }

    public static void printArray(int[] arrayName) {
        for (int i = 0; i < arrayName.length; i++) {
            System.out.println(arrayName[i]);
        }
    }

    public static int[] sortIntegers(int[] arr) {
        int temp = 0;
        int[] sortedArray = new int[arr.length];
        for (int a = 0; a < arr.length; a++) {
            sortedArray[a] = arr[a];
        }

        for (int i = 0; i < sortedArray.length; i++) {
            for (int j = i + 1; j < sortedArray.length; j++) {
                if (sortedArray[i] < sortedArray[j]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = temp;
                }
            }
        }
        return sortedArray;
    }
}
