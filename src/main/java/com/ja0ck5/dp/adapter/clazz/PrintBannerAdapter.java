package com.ja0ck5.dp.adapter.clazz;

/**
 * 扮演 适配器
 * 继承 Banner
 * 实现 Print
 * <p>
 * 用于满足 Target
 * @see Print 的需求
 *
 *
 * 这里通过继承来使用 Adaptee --> Banner 角色
 */
public class PrintBannerAdapter extends Banner implements Print {
    public PrintBannerAdapter(String string) {
        super(string);
    }

    public void printWeak() {// 在要实现的接口的方法里面，使用继承的方法作为具体实现. 即 适配
        // 希望在 Print 接口中使用到 Banner 的方法 使用 继承+实现的方式适配方法
        showWithParen();
    }

    public void printStrong() {
        showWithAster();
    }
}
