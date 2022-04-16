package com.company;

public class Main
{
    public static void main(String[] args)
    {
        ComplexNumber one = new ComplexNumber(1.0,1.0);
        ComplexNumber two = new ComplexNumber(2.5,-1.5);

        two.add(1,1);
        System.out.println(two.getImaginary());
        one.subtract(two);
    }
}
