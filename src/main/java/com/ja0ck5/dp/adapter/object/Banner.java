package com.ja0ck5.dp.adapter.object;

/**
 * 类适配器模式
 *
 * 1. 现在的实际情况
 */
public class Banner {

    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen(){
        System.out.println("("+string+")");
    }

    public void showWithAster(){
        System.out.println("*"+string+"*");
    }
}