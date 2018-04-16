package com.ashish;

public class Main {

    public static void main(String[] args) {
        scorecalculations(true,800,5,100);
        scorecalculations(true,10000,8,200);
        int sc = calculatehighscoreposition(1500);
        displayhighscorepostion("Ashish",sc);
        int sc1 = calculatehighscoreposition(900);
        displayhighscorepostion("Vipin",sc1);
        int sc2 = calculatehighscoreposition(400);
        displayhighscorepostion("Abhi",sc2);
        int sc3 = calculatehighscoreposition(50);
        displayhighscorepostion("Aniket",sc3);
    }
    public static int scorecalculations(boolean gameOver, int score, int levelcompleted, int bonus){
        if (gameOver==true){
            int finalscore = score + (levelcompleted * bonus) ;
            finalscore = finalscore + 2000 ;
            System.out.println("Final score was "+ finalscore);
            return finalscore;
        }else{
            return -1;
        }

    }
    public static void displayhighscorepostion(String playerName, int position){
        System.out.println(playerName + " managed to get into position " + position + " on the high score table");
    }
    public static int calculatehighscoreposition(int playerscore){
        if(playerscore >=1000){
            return 1;
        }else if(playerscore >=500 && playerscore<1000){
            return 2;
        }else if(playerscore >=100 && playerscore<500){
            return 3;
        }else{
            return 4;
        }
    }
}
