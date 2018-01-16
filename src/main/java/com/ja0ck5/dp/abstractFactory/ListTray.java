package com.ja0ck5.dp.abstractFactory;

import java.util.Iterator;

/**
 * item 中保存的不管是 ListLink 还是 ListTray 实例
 * 只是简单地调用了 item.makeHTML() 方法
 * 这里不能使用 switch 或者 if else 去判断变量 item 中保存的实例的类型
 * 否则就变成了 非面向对象编程
 */
public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    public String makeHtml() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<li>\n");
        buffer.append(caption + "\n");
        buffer.append("<ul>\n");
        Iterator it = tray.iterator();
        while (it.hasNext()) {
            Item item = (Item) it.next();
            buffer.append(item.makeHtml());
        }
        buffer.append("</ul>\n");
        buffer.append("</li>\n");
        return buffer.toString();
    }
}
