package com.kodilla.rps;

public class PrintOpponentMove {

    public static int printOpponentMove() {
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

}
