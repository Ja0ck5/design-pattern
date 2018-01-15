package com.ja0ck5.dp.builder;

/**
 * 通常建造具有复杂结构的物体时,很难一气呵成.我们需要建造组成这个物体的各个部分,
 * 然后分阶段将它们组装起来。
 * <p>
 * 是一个声明了编写文档方法的抽象类.
 */
public abstract class Builder {

    public abstract void makeTitle(String title);

    public abstract void makeString(String str);

    public abstract void makeItems(String[] items);

    public abstract void close();

}
