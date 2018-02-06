package com.ja0ck5.dp.visitor;

import java.util.Iterator;

/**
 * 在 Visitor 模式中,visit 方法将处理都在 ListVisitor 里面了
 * accept 方法
 * element.accept(visitor)
 * visit 方法
 * 而 visitor.visit(element)
 * 对比这两个方法,它们是相反的关系.element 接受 visitor,而 visitor 又访问 element
 * 在 Visitor 模式中,ConcreteElement 和 ConcreteVisitor 这两个角色共同决定了实际进行的处理.
 * 这种消息分发的方式 一般被称为 双重分发(double dispatch)
 * <p>
 * 为什么要弄得那么复杂？
 * 直接编写循环语句不就解决了？
 * Visitor 模式的目的是 将处理从数据结构中分离出来。
 * 数据结构很重要
 * 需要注意的是,保存数据结构与 以数据结构为基础进行处理是两种不同的东西
 * <p>
 * ConcreteVisitor 角色的开发可以独立于 File 类 和Directory 类。Visitor 模式提高了File类和Directory类作为组件的独立性
 * <p>
 * 开闭原则
 * 对扩展开放，对修改关闭。
 * 在不修改现有代码的前提下进行扩展。
 */
public class ListVisitor extends Visitor {
    private String currentDir = "";

    public void visit(File file) {
        System.out.println(currentDir + "/" + file);
    }

    public void visit(Directory directory) {
        System.out.println(currentDir + "/" + directory);
        String saveDir = currentDir;
        currentDir = currentDir + "/" + directory.getName();
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            entry.accept(this);
        }
        currentDir = saveDir;
    }
}
