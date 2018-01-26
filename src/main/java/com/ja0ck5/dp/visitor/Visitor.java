package com.ja0ck5.dp.visitor;

/**
 * Visitor 模式
 * 访问数据结构并处理数据
 * <p>
 * 数据结构与处理被分离开来
 * <p>
 * 表示访问者的类
 */
public abstract class Visitor {

    public abstract void visit(File file);

    public abstract void visit(Directory directory);
}
