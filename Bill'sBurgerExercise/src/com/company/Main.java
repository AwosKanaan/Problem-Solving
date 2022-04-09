package com.company;

public class Main
{
    public static void main(String[] args)
    {
        Hamburger hamburger = new Hamburger("Basic","Sausage","white", 3.56);
        hamburger.addHamburgerAddition1("Tomato",0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total burger price is: " + hamburger.itemizeHamburger());

        System.out.println("************************************************************");

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAddition1("Test",0);
        System.out.println("Total deluxe burger price is " + deluxeBurger.itemizeHamburger());

        System.out.println("************************************************************");

        HealthyBurger healthyBurger = new HealthyBurger("Bacon",5.67);
        healthyBurger.addHealthyAddition1("Egg",5.43);
        healthyBurger.addHealthyAddition2("lentils",3.41);
        System.out.println("Total healthy burger price " + healthyBurger.itemizeHamburger());
    }
}
