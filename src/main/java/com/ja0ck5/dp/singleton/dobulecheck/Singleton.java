package com.ja0ck5.dp.singleton.dobulecheck;

/**
 * 1. 栈内存开辟空间给引用
 * 2. 堆内存开辟空间准备初始化对象
 * 3. 初始化对象
 * 4. 栈中引用指向这个堆内存空间地址
 * 指令重排之后 3. 4. 的顺序可能调换
 * 在多线程环境下会出问题
 * 4的时候已经指向了一块堆内存 并且可能为 null
 * 因为这块堆内存还没初始化就直接返回了
 */
public class Singleton {
    // 禁止指令重排序
    private static volatile Singleton instance = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (null == instance) {
            synchronized (Singleton.class) {
                if (null == instance)
                    instance = new Singleton();
            }
        }
        return instance;
    }
}