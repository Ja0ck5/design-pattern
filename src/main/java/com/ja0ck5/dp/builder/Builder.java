package com.ja0ck5.dp.builder;

/**
 * 通常建造具有复杂结构的物体时,很难一气呵成.我们需要建造组成这个物体的各个部分,
 * 然后分阶段将它们组装起来。
 * <p>
 * 是一个声明了编写文档方法的抽象类.
 * <p>
 * Template Method 模式
 * 在 Builder 模式中，Director 角色 控制 Builder 角色。
 * 在 Template Method 模式 中,父类控制子类
 * <p>
 * Composite 模式
 * 有些情况下 Builder 模式生成的实例构成了 Composite 模式。
 * <p>
 * Abstract Factory 模式
 * Builder 模式 和 Abstract Factory 模式都用于生成复杂的实例
 * <p>
 * Facade 模式
 * 在 Builder 模式 中,Director 角色通过 Builder 角色中的复杂发放向外部提供可以简单生成实例
 * 的接口
 * Facade 模式中 Facade 角色则是通过组合模块向外部提供可以简单调用的接口
 */
public abstract class Builder {

    public abstract void makeTitle(String title);

    public abstract void makeString(String str);

    public abstract void makeItems(String[] items);

    public abstract void close();

}
