package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    static int roundsToEnd = 1;
    static int numberUserWin = 0;
    static int numberOpponentWin = 0;
    static int draw = 0;
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        boolean end = false;

        System.out.println("What's your name?");
        String firstName = scan.nextLine();

        while (!end) {

            System.out.println("\nPress n to start new game. \nPress x to quit game");
            String game = scan.next();

            numberUserWin = 0;
            numberOpponentWin = 0;
            draw = 0;

            if (game.equals("n")) {

                System.out.println("Hello " + firstName + ". How many rounds do you want to play?");
                int rounds = scan.nextInt();
                for (int i = 1; i < rounds + 1; i++) {

                    System.out.println("\nThis is " + i + " round.");
                    System.out.println("Make your move. Please press: \n1) Rock \n2) Paper \n3) Scissors \nPress x to quit game");
                    String rps = scan.next();

                    if (rps.equals("x")) {
                        break;
                    }

                    gameLoop(rps);
                }
                printResult();
                System.out.println("Game over");
            }
            else end = true;
        }
    }

    private static void gameLoop(String rps){
        printYourMove(rps);
        int opponentMove = printOpponentMove();
        finalResult(rps, opponentMove);

        System.out.println("Current score is: \nYou win: " + numberUserWin + "\nOpponent win: " + numberOpponentWin + "\nDraw: " + draw);

        roundsToEnd++;
    }
    private static void printResult(){

        if (numberUserWin > numberOpponentWin) {
            System.out.println("You win this game!");
        } else if (numberOpponentWin > numberUserWin) {
            System.out.println("You lost this game!");
        } else if (draw >= numberUserWin) {
            System.out.println("Is a draw!");
        } else if (draw >= numberOpponentWin) {
            System.out.println("Is a draw!");
        } else {
            System.out.println("Is a draw!");
        }

    }
    private static void printYourMove(String rps){
        if (rps.equals("1")) {
            System.out.println("You choose a rock");
        }
        if (rps.equals("2")) {
            System.out.println("You choose a paper");
        }
        if (rps.equals("3")) {
            System.out.println("You choose a scissors");
        }
    }
    private static int printOpponentMove(){
        RandomNumber rand = new RandomNumber();

        int opponentMove = rand.getRandom();

        if (opponentMove == 0) {
            System.out.println("Opponent choose a rock");
        }
        if (opponentMove == 1) {
            System.out.println("Opponent choose a paper");
        }
        if (opponentMove == 2) {
            System.out.println("Opponent choose a scissors");
        }
        return opponentMove;
    }
    private static void finalResult(String rps, int opponentMove){
        int[][] winTable = {
                {5, 0, 1, -1},
                {5, -1, 0, 1},
                {5, 1, -1, 0}
        };

        int value = Integer.parseInt(rps);

        if (winTable[opponentMove][value] == -1) {
            numberOpponentWin++;
            System.out.println("Opponent win this round!");
        }

        if (winTable[opponentMove][value] == 0) {
            draw++;
            System.out.println("Draw!");
        }

        if (winTable[opponentMove][value] == 1) {
            numberUserWin++;
            System.out.println("You win this round!");
        }
    }

}


