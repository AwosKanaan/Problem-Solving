package com.company;

public class Main
{
    public static void main(String[] args)
    {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B","Dell", "500",dimensions);

        Monitor theMonitor = new Monitor("27 Inch Beast","Samsung", 27,new Resolution(2540,1440));
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4,2, "v2.44");

        Pc thePc = new Pc(theCase,theMonitor,theMotherboard);
        thePc.powerUp();
    }
}
