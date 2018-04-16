package com.ashish;

public class Main {

    public static void main(String[] args) {
        int result = 1+2 ;
        System.out.println("result = "+result);
        int previousresult = result;
        result = result -1;
        System.out.println(previousresult + " - 1 = " +result );
        previousresult = result;
        result = result * 10 ;
        System.out.println(previousresult + " * 10 = " + result);
        previousresult = result;
        result = result/5;
        System.out.println(previousresult + " / 5 = " + result);
        previousresult = result;
        result = result % 3;
        System.out.println(previousresult + " % 3 = " + result);
        result++;
        System.out.println("result now = "+ result);
        result--;
        System.out.println("result now = "+ result);


        boolean isAlien =  false;
        if (isAlien == false)
            System.out.println("Is not an alien!");
        int myvalue = 50;
        if(myvalue == 50)
            System.out.println("yeah!!");

        double firstdouble = 20d;
        double seconddouble = 80d;
        double result1 = (firstdouble + seconddouble)* 25d;
        result1 = result1 % 40;
        if (result1 <= 20)
            System.out.println("Total was over the limit");
    }
}
