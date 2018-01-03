package com.ja0ck5.dp.adapter;

/**
 * 适配器模式也被称为 Wrapper 模式 . 将某样东西包装起来，使其能够用于其他的用途，就被用作乘坐包装器 或者适配器
 *
 * Adapter 模式有两种
 *
 *  i. 类适配器模式(使用继承的适配器模式)
 *  ii. 对象适配器模式(使用委托的适配器模式)
 *
 *  什么时候使用适配器？
 *  1. 如果有现成的代码
 *  当我们并非从零开始编程的时候，经常会用到现有的类。特别是当现有的类被充分测试过，Bug 很少的时候
 *  我们可以就此重复利用。
 *  Adapter 模式会对现有的类进行适配，生成新的类。通过该模式，我们可以很方便的创建我们需要的方法群。
 *  当出现 Bug 时候，我们很明确 Bug 不是出现在现有的类当中，而是新的扮演 Adapter 的类中。
 *
 *  2. 如果没有现成的代码
 *  在让现有的类适配新的接口时，常常会觉得"这里修改一下就可以了" 的想法。但是这样很可能会修改现有的代码，使用
 *  Adapter 模式就可以在完全不改变现有代码的情况下，使用现有代码去适配新的API.
 *  在 Adapter 模式中，并非一定需要现成的代码，只要只当现有的类的功能，就可以编写出新的类。
 *
 *
 */
public interface Adapter {
}
