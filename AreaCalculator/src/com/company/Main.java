package com.company;

public class Main
{

    public static void main(String[] args)
    {
        area(5);
        area(5,4);
    }
    public static double area(double radius)
    {
        final double PI = Math.PI;
        double circleArea = radius * radius * PI;
        if (radius < 0)
        {
            System.out.println("Not Valid");
            return -1.0;
        }

        System.out.println(circleArea);
        return circleArea;

        }
    public static double area(double x, double y)
    {
        double areaOfRectangle = x * y;
        if (x < 0 || y < 0)
        {
            return -1.0;
        }
        System.out.println(areaOfRectangle);
        return areaOfRectangle;
    }

}
