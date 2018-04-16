package com.ashish;

public class Main {

    public static void main(String[] args) {


        Hamburger hamburger = new Hamburger("basic", "sausage", 3.56, "white");
        double price = hamburger.itemizedhamburger();
        hamburger.addhamburgeraddition1(" Tomato ", 0.25);
        hamburger.addhamburgeraddition2(" lettuce ", 0.75);
        hamburger.addhamburgeraddition3(" cheese ", 1.00);
        price = hamburger.itemizedhamburger();
        System.out.println("Total price is :" + price);

        Healthyburger healthyburger =  new Healthyburger("Bacon ", 5.67);
        healthyburger.addedheath1("eggs", 5.00);
        healthyburger.addedheath2("lentils", 3.41);

        System.out.println("HEALTHY BURGER PRICE" + healthyburger.itemizedhamburger());

        Deluxeburger db = new Deluxeburger();
        db.addhamburgeraddition3("should not be this", 50.53);
        db.itemizedhamburger();




    }
}
