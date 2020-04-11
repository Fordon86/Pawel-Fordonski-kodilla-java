package com.kodilla.rps;

public class ResultPrinter {

    public static void printResult(GameLoop gameLoop){

        if (gameLoop.getNumberUserWin() > gameLoop.getNumberOpponentWin()) {
            System.out.println("You win this game!");
        } else if (gameLoop.getNumberOpponentWin() > gameLoop.getNumberUserWin()) {
            System.out.println("You lost this game!");
        } else if (gameLoop.getDraw() >= gameLoop.getNumberUserWin() ) {
            System.out.println("Is a draw!");
        } else if (gameLoop.getDraw() >= gameLoop.getNumberOpponentWin()) {
            System.out.println("Is a draw!");
        } else {
            System.out.println("Is a draw!");
        }

    }
}
