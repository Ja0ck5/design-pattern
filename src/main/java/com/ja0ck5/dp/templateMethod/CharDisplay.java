package com.ja0ck5.dp.templateMethod;

/**
 * 实现父类的抽象方法，以用于父类的模板方法
 *
 * i. 可以是逻辑处理通用化
 *    在父类的模板方法中编写了算法，因此无需在每个子类中再编写算法
 *    当模板方法发现 bug 的时候，基本上只需要修改模板方法即可
 *
 * ii. 父子类之间的协作
 *     在模板方法模式中，父类和子类是紧密联系的。因此在子类实现父类的抽象方法中
 *     必须要理解这些抽象方法被调用的时机。在看不到父类源码的情况下编写子类的代码是很困难的
 * iii. 父类和子类的一致性
 *     无论在父类类型的变量中保存哪个子类的实例，程序都可以正常工作，即里氏替换原则
 *
 * 虽然具体的处理内容是由子类决定的 不过在抽象类阶段确定处理的流程非常重要
 *
 * 最好不要重写 模板方法， 所以一般给模板方法加上 final
 */
public class CharDisplay extends AbstractDisplay {
    private char ch;

    public CharDisplay(char ch) {
        this.ch = ch;
    }

    public void open() {
        System.out.println("<<");
    }

    public void print() {
        System.out.println(ch);
    }

    public void close() {
        System.out.println(">>");
    }
}
