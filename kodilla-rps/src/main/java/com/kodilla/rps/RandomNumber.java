package com.kodilla.rps;

import java.util.Random;

public class RandomNumber {

    private Random random = new Random();

    public int getRandom() {
        return random.nextInt(3);
    }

}
