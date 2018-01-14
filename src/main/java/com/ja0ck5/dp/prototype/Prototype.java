package com.ja0ck5.dp.prototype;

/**
 * 通过复制生成实例
 * <p>
 * 通常使用 new 生成实例。但是也有 在不指定类名的前提下生成实例 的需求
 * <p>
 * 1. 对象种类繁多,无法将它们整合到一个类中时
 * 需要处理的对象太多,如果将它们分别作为一个类,必须要编写很多个类文件
 * <p>
 * 2. 难以根据类生成实例
 * 生成实例的过程太复杂,很难根据类生成实例.
 * 例如,用户在图形编辑中使用鼠标制作出的图形的实例. 想在程序中创建这样的实例是非常困难的.
 * 通常,在想生成一个和之前用户通过操作所创建出的完全一样的实例的时候,我们会实现将用户通过操作
 * 所创建出的实例保存起来,然后在需要的时候通过复制来生成实例.
 * <p>
 * 3. 想解耦框架与生成的实例时
 * 想让生成实例的框架不依赖于具体的类。这个时候，不能指定类名来生成实例.
 * 要事先 注册 一个 原型 实例。 然后通过复制该实例来生成实例。
 *
 *
 * 相关的设计模式
 *
 * 1. Flyweight 模式
 * Prototype 模式可以生成一个与当前实例的状态完全一样的实例
 * Flyweight 模式 可以在不同的地方使用同一个实例
 *
 * 2. Memento 模式
 * Prototype 模式可以生成一个与当前实例的状态完全一样的实例
 * Memento 模式 可以保存当前实例的状态,以实现快照和撤销功能
 *
 * 3. Composite 模式 和 Decorator 模式
 * 经常使用 Composite 模式 和 Decorator 模式 时,需要动态地创建复杂结构的实例.这个时候可以使用 Prototype 模式
 *
 * 4. Command 模式
 * 想要复制 Command 模式中出现的命令，可以使用 prototype 模式
 *
 *
 */
public class Prototype {
}
