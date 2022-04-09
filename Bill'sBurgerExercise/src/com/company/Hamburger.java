package com.company;

public class Hamburger
{
    private String name;
    private String meat;
    private String breadRollType;
    private double price;

    public Hamburger(String name, String meat, String breadRollType, double price)
    {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
        System.out.println(name + " hamburger on a " + breadRollType + " roll with " + meat + ", price is " + price);
    }

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public void addHamburgerAddition1(String addition1Name, double addition1Price)
    {
        price += addition1Price;
        System.out.println("Added " + addition1Name + " for and extra " + addition1Price);
    }

    public void addHamburgerAddition2(String addition2Name, double addition2Price)
    {
        price += addition2Price;
        System.out.println("Added " + addition2Name + " for and extra " + addition2Price);
    }
    public void addHamburgerAddition3(String addition3Name, double addition3Price)
    {
        price += addition3Price;
        System.out.println("Added " + addition3Name + " for and extra " + addition3Price);
    }
    public void addHamburgerAddition4(String addition4Name, double addition4Price)
    {
        price += addition4Price;
        System.out.println("Added " + addition4Name + " for and extra " + addition4Price);
    }

    public double itemizeHamburger()
    {
        price += addition1Price + addition2Price + addition3Price + addition4Price;
        return price;
    }


}
