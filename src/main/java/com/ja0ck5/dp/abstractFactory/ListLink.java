package com.ja0ck5.dp.abstractFactory;

/**
 * 具体的产品
 */
public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }

    public String makeHtml() {
        return "<li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
