package com.ja0ck5.dp.templateMethod;

public abstract class AbstractDisplay {

    public abstract void open();

    public abstract void print();

    public abstract void close();

    /**
     * 在父类的方法利用抽象方法，组合好模板
     */
    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }


}
