package com.ashish;

public class Main {

    public static void main(String[] args) {
	    char switchvalue = 'A';
	    switch (switchvalue){
            case 'A':
                System.out.println("We found A");
                break;

            case 'B':
                System.out.println("We found B");
                break;

            case 'C':
                System.out.println("We found C");
                break;

            default:
                System.out.println("Not A, B, C");
                break;

        }
        String month = "January";
	    switch(month.toLowerCase()){
            case "january":
                System.out.println("It's january");
                break;
            case "june":
                System.out.println("It's june");
                break;
            default:
                System.out.println("It's not january");
                break;
        }

    }
}
