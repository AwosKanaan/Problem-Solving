package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
//        String s1 = scan.nextLine();
        int num1 = 0;
        while (scan.hasNextLine()) {
            ++num1;
            System.out.println(num1 + " " + scan.nextLine());
        }

//Create Scanner object
//        Scanner scan = new Scanner("Hello World!");
//        //Printing the delimiter used
//        System.out.println("Delimiter:" + scan.delimiter());
//        //Print the Strings
//        while (scan.hasNext()) {
//            System.out.println(scan.next());
//        }
//        //Close the scanner
//        scan.close();
    }
}
