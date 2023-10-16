package com.manav;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        0 --> Rock
//        1 --> Paper
//        2 --> Scissor

        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter 0 for rock, 1 for paper and 2 for scissor: ");
            int userInput = sc.nextInt();

            Random random = new Random();
            int compInput = random.nextInt(3);

            if (userInput == compInput) {
                System.out.println("Draw the game");
            }
            else if (userInput == 0 && compInput == 2 || userInput == 1 && compInput == 0
                    || userInput == 2 && compInput == 1) {
                System.out.println("You win the game");
            }
            else {
                System.out.println("You loss the game");
            }

            if (compInput == 0) {
                System.out.println("Computer choice = Rock");
            }
            else if (compInput == 1) {
                System.out.println("Computer choice = Paper");
            }
            else {
                System.out.println("Computer choice = Scissor");
            }

            System.out.println("Do you want to play more!!!");
            System.out.println("Press 0 for finish the game, 1 for continue the game");
            int choice = sc.nextInt();

            if(choice == 0){
                break;
            }
            else{
                continue;
            }
        }while (true);
    }
}