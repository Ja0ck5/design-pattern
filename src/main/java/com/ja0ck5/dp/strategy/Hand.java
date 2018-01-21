package com.ja0ck5.dp.strategy;

public class Hand {
    public static final int HANDVALUE_GUU = 0;// 石头
    public static final int HANDVALUE_CHO = 1;// 剪刀
    public static final int HANDVALUE_PAA = 2;// 布

    public static final Hand[] hand = {// 表示猜拳中 3 种 手势的实例
            new Hand(HANDVALUE_GUU),
            new Hand(HANDVALUE_CHO),
            new Hand(HANDVALUE_PAA),
    };

    private static final String[] name = {// 表示猜拳中 3 种 手势所对应的字符串
            "石头", "剪刀", "布",
    };

    public Hand(int handvalue) {
        this.handvalue = handvalue;
    }

    private int handvalue;

    public static Hand getHand(int handvalue) {// 根据手势的值获取其对应的实例
        return hand[handvalue];
    }

    // 如果 this 胜了 h 则返回 true
    public boolean isStrongThan(Hand h) {
        return fight(h) == -1;
    }

    // 0 平局 1 win -1 lose
    private int fight(Hand h) {
        return this == h ? 0 : (((this.handvalue + 1) % 3) == h.handvalue ? 1 : -1);
    }

    @Override
    public String toString() {
        return name[handvalue];
    }
}
