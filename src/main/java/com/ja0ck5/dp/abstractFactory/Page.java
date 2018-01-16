package com.ja0ck5.dp.abstractFactory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/**
 * 抽象的产品
 */
public abstract class Page {

    protected String title;

    protected String author;

    protected List content = new ArrayList();


    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void add(Item item) {
        content.add(item);
    }

    /**
     * 此方法典型的 Template method 模式
     */
    public void output() {
        String finename = title + ".html";
        try {
            Writer writer = new FileWriter(finename);
            writer.write(this.makeHTML());
            writer.close();
            System.out.println(finename + " 编写完成");
        } catch (IOException e) {
            // e
        }
    }

    public abstract String makeHTML();
}
