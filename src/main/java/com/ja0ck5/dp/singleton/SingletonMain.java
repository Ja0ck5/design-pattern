package com.ja0ck5.dp.singleton;

public class SingletonMain {

    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        if(obj1 == obj2){
            System.out.println("the same instance");
        }
    }

}
