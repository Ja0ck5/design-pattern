package com.ja0ck5.dp.visitor;

/**
 * 接受访问者的访问的接口
 */
public interface Element {

    void accept(Visitor v);

}
