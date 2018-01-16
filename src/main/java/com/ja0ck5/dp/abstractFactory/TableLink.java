package com.ja0ck5.dp.abstractFactory;

public class TableLink extends Link {
    public TableLink(String caption, String url) {
        super(caption, url);
    }

    public String makeHtml() {
        return "<td><a href=\"" + url + "\">" + caption + "</a></td>\n";
    }
}
