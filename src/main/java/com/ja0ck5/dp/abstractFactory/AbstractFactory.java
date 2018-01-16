package com.ja0ck5.dp.abstractFactory;

/**
 * 抽象工厂模式
 * 将关联零件组装成产品
 * 抽象工厂的工作是将抽象零件组装为抽象产品
 * <p>
 * 易于增加具体的工厂
 * 难以增加新的零件
 * 1.需要在具体的工厂增加生产具体零件的方法
 * 2. 需要编写具体的零件类
 * 当具体工厂越多,修改的工作量就会越大
 * <p>
 * <p>
 * 相关的设计模式
 * Builder 模式
 * Abstract Factory 模式 通多调用抽象产品的接口来组装抽象产品,生成具有复杂结构的实例
 * Builder 模式 是分阶段地制作复杂实例
 * <p>
 * Factory Method模式
 * 有时 Abstract Factory 模式 中零件和产品的生成会用到 Factory Method模式
 * <p>
 * Composite模式
 * 有时 Abstract Factory 模式 中在制作产品的时候会使用到 Composite 模式
 * <p>
 * Singleton 模式
 * 有时 Abstract Factory 模式 中的具体工厂会使用到Singleton 模式
 */
public abstract class AbstractFactory {
}
