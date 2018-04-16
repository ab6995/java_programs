package com.ashish;

public class Main {

    public static void main(String[] args) {
        int number = 5;
        int lastnumber = 20;
        while(number <= lastnumber){
            if(!iseven(number)){
                number++;
                continue;

            }
            System.out.println(number + "is even number.");
            number++;
        }
        boolean mynumber = iseven(3);
        System.out.println(mynumber);

    }
    public static boolean iseven(int n){
        if (n%2 == 0){
            return true;
        }
        return false;
    }
}
