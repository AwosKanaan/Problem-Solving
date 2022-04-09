package com.company;

public class HealthyBurger extends Hamburger
{
    private String healthyExtra1Name;
    private double healthyExtra1price;
    private String healthyExtra2Name;
    private double healthyExtra2price;


    private double price1;
    public HealthyBurger(String meat ,double price)
    {
        super("Healthy",meat, "Brown rye ",5.67);
        price1 = price;
    }

    private double addition1Price;
    public void addHealthyAddition1(String name,double price)
    {
        System.out.println("Added " + name + " for an extra " + price);
        addition1Price = price;
    }

    private double addition2Price;
    public void addHealthyAddition2(String name,double price)
    {
        System.out.println("Added " + name + " for an extra " + price);
        addition2Price = price;
    }
    @Override
    public double itemizeHamburger()
    {
       double test = (price1 + addition1Price + addition2Price);
        return test;
    }

}
