package com.ashish;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String rolltype;

    private String addition1name;
    private double addition1price;

    private String addition2name;
    private double addition2price;

    private String addition3name;
    private double addition3price;

    private String addition4name;
    private double addition4price;

    public Hamburger(String name, String meat, double price, String rolltype) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.rolltype = rolltype;
    }

    public void addhamburgeraddition1(String name ,double price){
        this.addition1name = name;
        this.addition1price = price;

    }
    public void addhamburgeraddition2(String name ,double price){
        this.addition2name = name;
        this.addition2price = price;

    }
    public void addhamburgeraddition3(String name ,double price){
        this.addition3name = name;
        this.addition3price = price;

    }
    public void addhamburgeraddition4(String name ,double price){
        this.addition4name = name;
        this.addition4price = price;

    }

    public double itemizedhamburger() {
        double humburberprice = this.price;
        System.out.println(this.name + " hamburger on a " + this.rolltype + "roll" + "price is" + this.price);
        if (this.addition1name != null) {
            humburberprice += this.addition1price;
            System.out.println("added" + this.addition1name + "at a price of" + this.addition1price);
        }
        if (this.addition2name != null) {
            humburberprice += this.addition2price;
            System.out.println("added" + this.addition2name + "at a price of" + this.addition2price);

        }

        if (this.addition3name != null) {
            humburberprice += this.addition3price;
            System.out.println("added" + this.addition3name + "at a price of" + this.addition3price);
        }
        if (this.addition4name != null) {
            humburberprice += this.addition4price;
            System.out.println("added" + this.addition4name + "at a price of" + this.addition4price);
        }
        return humburberprice;

    }
}
