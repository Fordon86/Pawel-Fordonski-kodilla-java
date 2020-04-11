package com.kodilla.rps;

public class GameLoop {

        private int numberOpponentWin = 0;
        private int draw = 0;
        private int numberUserWin = 0;

        public void doGameLoop(String rps){

                PrintYourMove.printYourMove(rps);
                int opponentMove = PrintOpponentMove.printOpponentMove();
                int result = RoundResult.getRoundResult(rps, opponentMove);

                switch (result){
                        case -1: numberOpponentWin++;
                                System.out.println("Opponent win this round!");
                                break;
                        case 0: draw++;
                                System.out.println("Draw!");
                                break;
                        case 1: numberUserWin++;
                                System.out.println("You win this round!");
                                break;
                }

        System.out.println("Current score is: \nYou win: " + numberUserWin + "\nOpponent win: " + numberOpponentWin + "\nDraw: " + draw);

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
