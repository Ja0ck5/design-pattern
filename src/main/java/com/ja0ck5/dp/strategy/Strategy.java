package com.ja0ck5.dp.strategy;

/**
 * Strategy 模式
 * 可以整体地替换算法的实现部分. 能够轻松地以不同的算法去解决同一个问题。
 */
public interface Strategy {

    Hand nextHand();

    void study(boolean win);
}
