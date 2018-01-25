package com.ja0ck5.dp.decorator;

/**
 * 通过继承 装饰边框 与 被装饰物 具有了相同的方法
 */
public abstract class Border extends Display {

    protected Display display;

    public Border(Display display) {
        this.display = display;
    }
}
