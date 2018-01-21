package com.ja0ck5.dp.strategy;

import java.util.Random;

public class WinningStrategy implements Strategy {

    private Random random;

    private boolean won = false;

    private Hand prevHand;

    public WinningStrategy(int seed) {
        random = new Random(seed);
    }

    public Hand nextHand() {
        return (!won) ? Hand.getHand(random.nextInt(3)) : prevHand;
    }

    public void study(boolean win) {
        won = win;
    }
}
