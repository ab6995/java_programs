package com.ashish;

public class Main {

    public static void main(String[] args) {
	// write your code here
        byte bytevalue = 10;
        short shortvalue = 20;
        int intvalue = 50;
        long longtotal = 50000L + 10L * (bytevalue + shortvalue + intvalue);
        short shorttotal = (short) (1000 + 10 * (bytevalue + shortvalue + intvalue));
        System.out.println("Mytotal = " + longtotal);
        System.out.println("Myshorttotal = " + shorttotal);
    }
}
