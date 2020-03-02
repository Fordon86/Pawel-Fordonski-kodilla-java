package com.kodilla.exception.test;

public class ExceptionHandling extends Exception {
    public static void main(String[] args) {

       SecondChallenge secondChallenge = new SecondChallenge();

        try {
            String result = secondChallenge.probablyIWillThrowException(5, 1);
        } catch (Exception x) {
            System.out.println("Unhandled exception");
        } finally {
            System.out.println("It works?");
        }
    }
}
