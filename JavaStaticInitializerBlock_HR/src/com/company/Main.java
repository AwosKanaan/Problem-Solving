package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    static boolean flag = true;
    static int B = scan.nextInt();
    static int H = scan.nextInt();

    static {
        boolean flag;
        if (B > 0 && H > 0) {
            flag = true;
        }
        else {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
    public static void main(String[] args) {


    }
}
