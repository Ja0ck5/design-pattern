package com.ja0ck5.dp.bridge;

/**
 * 类的功能层次结构
 */
public class Display {
    private DisplayImpl impl;

    public Display(DisplayImpl impl) {
        this.impl = impl;
    }

    public void open() {
        impl.rawOpen();
    }

    public void close() {
        impl.rawClose();
    }

    public void print() {
        impl.rawPrint();
    }

    public final void display() {
        open();
        print();
        close();
    }

}
