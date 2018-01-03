package com.ja0ck5.dp.adapter.object;

/**
 * 委托就是将某个方法中的实际处理交给其他实例方法
 * 例如 PrintBannerAdapter 继承抽象类 Print 将里面的方法都委托给了 Banner
 */
public class ObjectAdapterMain {
    public static void main(String[] args) {
        Print p = new PrintBannerAdapter(new Banner("hello"));
        p.printWeak();
        p.printStrong();
    }
}
