package com.ashish;

public class Deluxeburger extends Hamburger {
    public Deluxeburger() {
        super("Deluxe","sausage & meat" ,14.53 , "white");
        super.addhamburgeraddition1("Chips",5.50);
        super.addhamburgeraddition2("Soda", 3.00);

    }

    @Override
    public void addhamburgeraddition1(String name, double price) {
        System.out.println("This should not be done ");
    }

    @Override
    public void addhamburgeraddition2(String name, double price) {
        System.out.println("This should not be done ");
    }

    @Override
    public void addhamburgeraddition3(String name, double price) {
        System.out.println("This should not be done ");
    }

    @Override
    public void addhamburgeraddition4(String name, double price) {
        System.out.println("This should not be done ");
    }
}
