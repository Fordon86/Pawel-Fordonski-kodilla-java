package com.kodilla.rps;

import static com.kodilla.rps.FinalResult.*;

public class PrintResult {

    public static void printResult(){

        if (numberUserWin > numberOpponentWin) {
            System.out.println("You win this game!");
        } else if (numberOpponentWin > numberUserWin) {
            System.out.println("You lost this game!");
        } else if (draw >= numberUserWin ) {
            System.out.println("Is a draw!");
        } else if (draw >= numberOpponentWin) {
            System.out.println("Is a draw!");
        } else {
            System.out.println("Is a draw!");
        }

    }
}
