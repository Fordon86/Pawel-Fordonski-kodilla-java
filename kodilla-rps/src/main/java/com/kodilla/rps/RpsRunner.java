package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args){

        RandomNumber rand = new RandomNumber();
        Scanner scan = new Scanner(System.in);

        int roundsToEnd = 1;
        int numberUserWin = 0;
        int numberOpponentWin = 0;
        int draw = 0;

        System.out.println("What's your name?");
        String firstName = scan.nextLine();
        System.out.println("Hello " + firstName+". How many rounds do you want to play?");
        Integer rounds = scan.nextInt();
        while (roundsToEnd < rounds) {

            for (int i = 1; i < rounds + 1; i++) {
                System.out.println("\nThis is " + i + " round.");
                System.out.println("Make your move. Please press: \n1) Rock \n2) Paper \n3) Scissors \nPress x to quit the game");
                Integer rps = scan.nextInt();
                String exit = Integer.toString(rps);
                System.out.println(exit);
                if (exit.equals("x") ) {
                    break;
                }
                if (rps == 1) {
                    System.out.println("You choose a rock");
                }
                if (rps == 2) {
                    System.out.println("You choose a paper");
                }
                if (rps == 3) {
                    System.out.println("You choose a scissors");
                }
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
                int winTable[][] = {
                        {5, 0, 1, -1},
                        {5, -1, 0, 1},
                        {5, 1, -1, 0}
                };

                if (winTable[opponentMove][rps] == -1) {
                    numberOpponentWin++;
                    System.out.println("Opponent win this round!");
                }

                if (winTable[opponentMove][rps] == 0) {
                    draw++;
                    System.out.println("Draw!");
                }

                if (winTable[opponentMove][rps] == 1) {
                    numberUserWin++;
                    System.out.println("You win this round!");
                }

/*                if (rps == 0){
                    break;
                }*/

                System.out.println("Current score is: \nYou win: " + numberUserWin + "\nOpponent win: " + numberOpponentWin + "\nDraw: " + draw);

                roundsToEnd ++;
            }
            if (numberUserWin > numberOpponentWin) {
                System.out.println("You win this game!");
            }
            else if (numberOpponentWin > numberUserWin) {
                System.out.println("You lost this game!");
            }
            else if (draw >= numberUserWin) {
                System.out.println("Is a draw!");
            }
            else if (draw >= numberOpponentWin) {
                System.out.println("Is a draw!");
            }

            else /*(numberOpponentWin == numberUserWin)*/ {
                System.out.println("Is a draw!");
            }
            break;
        }
        System.out.println("Game over");
    }
}
