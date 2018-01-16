package com.ja0ck5.dp.abstractFactory;

/**
 * 抽象的零件
 */
public abstract class Link extends Item {
    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
