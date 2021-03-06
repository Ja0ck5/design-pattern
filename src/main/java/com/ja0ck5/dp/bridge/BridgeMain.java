package com.ja0ck5.dp.bridge;

public class BridgeMain {

    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello,China."));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello,World."));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello,Universe."));

        d1.display();
        d2.display();
        d3.display();

        d3.multiDisplay(5);
    }
}
