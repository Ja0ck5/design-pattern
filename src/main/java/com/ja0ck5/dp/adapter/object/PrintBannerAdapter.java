package com.ja0ck5.dp.adapter.object;

/**
 * 这里通过委托来使用 Adaptee --> Banner 角色
 */
public class PrintBannerAdapter extends Print {

    private Banner banner;

    public PrintBannerAdapter(Banner banner) {
        this.banner = banner;
    }

    public void printWeak() {
        banner.showWithParen();
    }

    public void printStrong() {
        banner.showWithAster();

    }
}
