package com.kodilla.rps;

public class PrintYourMove {

    public static void printYourMove(String rps){
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
}
