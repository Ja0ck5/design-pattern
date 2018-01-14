package com.ja0ck5.dp.prototype;

/**
 * 复制功能的接口
 *
 * @see Product#use(String) 具体的使用交给子类
 * @see Product#createClone() 用于复制实例的方法.
 */
public interface Product extends Cloneable {

    void use(String s);

    Product createClone();
}
