package com.ja0ck5.dp.adapter.clazz;

/**
 * 类适配器模式
 *
 * 1. 现在的实际情况
 *
 * 在适配器模式中扮演 Adaptee 即 被适配者
 * 是一个持有既定方法的角色
 * 本质上的具体实现就是此角色
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