package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {


    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        boolean end = false;

        System.out.println("What's your name?");
        String firstName = scan.nextLine();

        while (!end) {

            System.out.println("\nPress n to start new game. \nPress x to quit game");
            String game = scan.next();

            if (game.equals("n")) {

                GameLoop gameLoop = new GameLoop();

                System.out.println("Hello " + firstName + ". How many rounds do you want to play?");
                int rounds = scan.nextInt();
                for (int i = 1; i < rounds + 1; i++) {

                    System.out.println("\nThis is " + i + " round.");
                    System.out.println("Make your move. Please press: \n1) Rock \n2) Paper \n3) Scissors \nPress x to quit game");
                    String rps = scan.next();

                    if (rps.equals("x")) {
                        break;
                    }

                    gameLoop.doGameLoop(rps);
                }
                ResultPrinter.printResult(gameLoop);
                System.out.println("Game over");
            }
            else end = true;
        }
    }
}


