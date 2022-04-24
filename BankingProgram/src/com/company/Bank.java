package com.company;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            branch.newCustomer(customerName, initialAmount);
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            branch.addCustomerTransaction(customerName, amount);
            return true;
        }
        return false;
    }

    public boolean listCustomers(String branchName, boolean printTransactions) {
        Branch existingBranch = findBranch(branchName);
        ArrayList<Customer> newCustomerArrayList = existingBranch.getCustomers();

        System.out.println("Customer details for branch " + existingBranch.getName());
        for (int i = 0; i < newCustomerArrayList.size(); i++) {
            System.out.println("Customer: " + newCustomerArrayList.get(i).getName() + "[" + (i + 1) + "]");

            if (printTransactions) {
                System.out.println("Transactions");
                ArrayList<Double> transactions = newCustomerArrayList.get(i).getTransactions();
                for (int j = 0; j < transactions.size(); j++) {
                    System.out.println("[" + (j + 1) + "]" + " Amount " + transactions.get(j));
                }
            }
        }
        return true;
    }

    private Branch findBranch(String branchName) {
        for (int i = 0; i < branches.size(); i++) {
            if (branches.get(i).getName().equals(branchName)) {
                return branches.get(i);
            }
        }
        return null;
    }
}
