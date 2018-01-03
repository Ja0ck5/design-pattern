package com.ja0ck5.dp.templateMethod;

public class TemplateMethodMain {
    public static void main(String[] args) {
        AbstractDisplay a1 = new CharDisplay('H');
        a1.display();
        AbstractDisplay a2 = new StringDisplay("Hello world");
        a2.display();
        AbstractDisplay a3 = new StringDisplay("你觉得怎么样");
        a3.display();
    }
}
