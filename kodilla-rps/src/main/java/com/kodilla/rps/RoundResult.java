package com.kodilla.rps;

public class RoundResult {

    private static int[][] winTable = {
            {0, 1, -1},
            {-1, 0, 1},
            {1, -1, 0}
    };

    public static int getRoundResult(String rps, int opponentMove) {

        int value = Integer.parseInt(rps)-1;
        int result = winTable[opponentMove][value];

        return result;
    }
}

