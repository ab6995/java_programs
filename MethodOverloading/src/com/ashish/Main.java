package com.ashish;

public class Main {

    public static void main(String[] args) {
        int result = calculations("ashish", 20);
        System.out.println("Result is = " + result);
        calculations(500);
        calculations();
        calcFeetAndinchestocentimeters(157);



    }
    public static int calculations(String Playername, int scores){
        System.out.println("Player" + Playername + "scored" + scores + "points.");
        return scores * 1000;
    }
    public static int calculations( int scores){
        System.out.println("Player with no name scored" + scores + "points.");
        return scores * 1000;
    }
    public static int calculations() {
        System.out.println("No Playername No score .");
        return 0 ;
    }
    public static double calcFeetAndinchestocentimeters(double feet, double inches){
        if(feet < 0 ||((inches<0) || (inches > 12))){
            return -1;
        }else {

            double centimeter = (((feet * 12)*2.54) + (inches * 2.54));
            System.out.println(feet + "feet," + inches + "inches = "+ centimeter +"centimeters");
            return centimeter;
        }
    }
    public static double calcFeetAndinchestocentimeters(double inches){
        if(inches< 0){
            return-1;
        }
        else{
            double feet = (int) inches /12;
            double remaininginches = (int) inches %12;
            System.out.println(inches + "inches is equal to" + feet +"feet and" + remaininginches+ "inches");
            return calcFeetAndinchestocentimeters(feet,remaininginches);
        }
    }

}
