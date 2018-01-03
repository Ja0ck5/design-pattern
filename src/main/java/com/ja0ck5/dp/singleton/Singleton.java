package com.ja0ck5.dp.singleton;

public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        return singleton;
    }

}
