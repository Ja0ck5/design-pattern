package com.ja0ck5.dp.factory;

public class FactoryMain {

    public static void main(String[] args) {
        IDCardFactory factory = new IDCardFactory();
        Product james = factory.create("James");
        Product haha = factory.create("Haha");
        Product gary = factory.create("Gary");
        james.use();
        haha.use();
        gary.use();
    }

}
