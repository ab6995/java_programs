package com.ashish;

public class Main {

    public static void main(String[] args) {
//        Car Audi = new Car();
//        Car Honda = new Car();
//        Audi.setModel("A4");
//        System.out.println("Model is " + Audi.getModel());
        Vipcustomer ash = new Vipcustomer();
        System.out.println(ash.getName());

        Vipcustomer vips = new Vipcustomer("Vipin",2500);
        System.out.println(vips.getName());

        Vipcustomer ani = new Vipcustomer("Aniket",25000, "anik@gmail.com");
        System.out.println(ani.getName());
        System.out.println(ani.getEmailadd());
        System.out.println(ani.getLimit());

    }
}
