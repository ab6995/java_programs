package com.ashish;

public class Main {

    public static void main(String[] args) {
	    Printer printer = new Printer(50, true);
        System.out.println("initial pages count =" +printer.getNumberofpages());
        int pagesprinted = printer.printpages(4);
        System.out.println("Pages printed was " + pagesprinted + "new total print count for printer = " + printer.getNumberofpages());
    }
}
