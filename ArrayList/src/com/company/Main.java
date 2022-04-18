package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }

    }

    public static void printInstructions() {
        System.out.println("\n press ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem() {
        System.out.println("Enter the grocery item: ");
        groceryList.addGroceryItem(scan.nextLine());
    }

    public static void modifyItem() {
        System.out.println("Current item name: ");
        String itemNo = scan.nextLine();
        System.out.println("Enter replacement item: ");
        String newItem = scan.nextLine();
        groceryList.modifyGroceryItem(itemNo, newItem);
    }

    public static void removeItem() {
        System.out.println("Enter item name: ");
        String position = scan.nextLine();
        groceryList.removeGroceryItem(position);
    }

    public static void searchForItem() {
        System.out.println("Enter item to be searched for: ");
        String search = scan.nextLine();
        scan.nextLine();
        if (groceryList.onFile(search)) {
            System.out.println("Found " + search);
        } else {
            System.out.println(search + ", not on file.");
        }
    }


}
