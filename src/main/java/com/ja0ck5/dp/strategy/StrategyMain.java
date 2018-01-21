package com.ja0ck5.dp.strategy;

public class StrategyMain {

    public static void main(String[] args) {
//        if (args.length != 2) {
//            System.out.println("Usage: java Main randomSeed1 randomSeed2");
//            System.out.println("Example : java Main 314 15");
//            System.exit(0);
//        }
//
//        int seed1 = Integer.parseInt(args[0]);
//        int seed2 = Integer.parseInt(args[1]);
        int seed1 = 315;
        int seed2 = 14;

        Player p1 = new Player("Taro", new WinningStrategy(seed1));
        Player p2 = new Player("Hana", new ProbStrategy(seed2));

        for (int i = 0; i < 1000; i++) {
            Hand nextHand1 = p1.nextHand();
            Hand nextHand2 = p2.nextHand();

            if (nextHand1.isStrongThan(nextHand2)) {
                System.out.println("Winner : " + p1);
                p1.win();
                p2.lose();
            } else if (nextHand2.isStrongThan(nextHand1)) {
                System.out.println("Winner : " + p2);
                p1.lose();
                p2.win();
            } else {
                System.out.println("Even......");
                p1.even();
                p2.even();
            }
        }

        System.out.println("Total result...");
        System.out.println(p1);
        System.out.println(p2);
    }
}
