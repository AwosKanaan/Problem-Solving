package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        reverse(arr);
    }

    private static void reverse(int [] array) {
        System.out.println("Original array = " + Arrays.toString(array));

        int temp = 0;
        int max = array.length - 1;
        int half = array.length / 2;

        for (int i = 0; i < half; i++) {
            temp = array[i];
            array[i] = array[max - i];
            array[max- i] = temp;
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}
