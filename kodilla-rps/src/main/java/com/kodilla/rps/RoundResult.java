package com.kodilla.rps;

public class FinalResult {

    private static int[][] winTable = {
            {5, 0, 1, -1},
            {5, -1, 0, 1},
            {5, 1, -1, 0}
    };

    private int numberOpponentWin = 0;
    private int draw = 0;
    private int numberUserWin = 0;

    public void getFinalResult(String rps, int opponentMove) {

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

    public int getNumberOpponentWin() {
        return numberOpponentWin;
    }

    public int getDraw() {
        return draw;
    }

    public int getNumberUserWin() {
        return numberUserWin;
    }
}

