package com.ashish;

public class Main {

    public static void main(String[] args) {
	    boolean gameover = true;
	    int score = 5000;
	    int levelcompleted = 5;
	    int bonus = 100;
	    if (gameover){
            int finalscore = score + (levelcompleted * bonus);
			System.out.println("your final score was" + finalscore);
		}
    }
}
