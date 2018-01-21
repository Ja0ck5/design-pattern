package com.ja0ck5.dp.bridge;

/**
 * Bridge 模式
 * 作用是将 类的功能层次结构 和 类的实现层次结构 连接起来
 * <p>
 * 类的层次结构的两个作用
 * 1. 希望增加功能时(类的功能层次结构)
 * 父类具有基本功能
 * 子类中增加新功能
 * <p>
 * 2. 希望增加新的实现(类的实现层次结构)
 * 父类通过声明抽象方法来定义接口
 * 子类通过实现具体方法来实现接口
 * <p>
 * 需要将 类的功能层次结构 和 类的实现层次结构 分离为两个独立的类层次结构
 * <p>
 * Template Method 模式
 * 在 Template Method 模式 中使用了 类的实现层次结构 父类调用抽象方法，而子类实现抽象方法
 * <p>
 * Abstract Factory 模式
 * 为了能够根据需求设计出良好的 ConcreteImplementor 角色 会使用Abstract Factory 模式
 * <p>
 * Adapter 模式
 * 使用 Bridge 模式 可以达到类的功能层次结构与类的实现层次结构分离的目的。并在此基础上使用这些层次结构结合起来
 * 使用 Adapter 模式 可以结合那些功能上相似但是接口不同的类
 */
public abstract class Bridge {
}
