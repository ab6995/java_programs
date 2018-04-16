package com.ashish;

public class Healthyburger extends Hamburger {
    private String HealthyExtra1name;
    private double HealthyExtra1price;

    private String HealthyExtra2name;
    private double HealthyExtra2price;

    public Healthyburger( String meat, double price) {
        super("Healthy", meat, price, "Brown");
    }
    public void addedheath1(String name, double price){
        this.HealthyExtra1name = name;
        this.HealthyExtra1price = price;
    }
    public void addedheath2(String name, double price){
        this.HealthyExtra2name = name;
        this.HealthyExtra2price = price;
    }

    @Override
    public double itemizedhamburger() {
        double hamburberprice =  super.itemizedhamburger();
        if (this.HealthyExtra1name != null){
            hamburberprice += this.HealthyExtra1price;
            System.out.println("added"+ this.HealthyExtra1name + "at a price of " + this.HealthyExtra1price);
        }
        if (this.HealthyExtra2name != null){
            hamburberprice += this.HealthyExtra2price;
            System.out.println("added"+ this.HealthyExtra2name + "at a price of " + this.HealthyExtra2price);
        }
        return hamburberprice;

    }
}
