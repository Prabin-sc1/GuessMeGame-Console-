package com.example.org;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println( "Welcome to Wonderland!");
        System.out.println("May I have your name?");
        Scanner s = new Scanner(System.in);
        String playerName = s.next();
        System.out.println("Hello "+playerName);
        System.out.println("Shall we start the game?");
        System.out.println("Please type\n1.for Yes \n2.for No");
        int answer=s.nextInt();

        while(answer != 1) {
            System.out.println("Hello " + playerName);
            System.out.println("Shall we start the game?");
            System.out.println("Please type\n1.for Yes \n2.for No");
            answer = s.nextInt();
        }
        Random r = new Random();
        int number = r.nextInt(30);
        System.out.println("What your guess number?");
        int userGuess = s.nextInt();
        int timesTried = 0;
        boolean hasWon = false;
        boolean shouldFinish = false;

        while(!shouldFinish){
            timesTried++;
            if(timesTried <= 5){
                if(userGuess == number){
                    hasWon = true;
                    shouldFinish = true;
                }else if(userGuess > number){
                    System.out.println("Guess lower");
                    userGuess = s.nextInt();
                }else{
                    System.out.println("Guess higher");
                    userGuess = s.nextInt();
                }

            }else{
                shouldFinish = true;
            }
        }
        if(hasWon){
            System.out.println("Congratulation "+playerName+"! you have guessed in your "+timesTried+" guess.");
        }else{
            System.out.println("Game Over!!!");
            System.out.println("The number was: "+number);
        }


    }
}
