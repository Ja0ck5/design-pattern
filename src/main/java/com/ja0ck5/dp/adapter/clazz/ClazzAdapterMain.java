package com.ja0ck5.dp.adapter.clazz;

public class ClazzAdapterMain {

    /**
     * 将  PrintBannerAdapter 的实例 保存在 Print 接口类型的变量 p 中
     * 对于 Main 方法来说，
     * @see Banner#showWithAster()
     * @see Banner#showWithParen()
     * 完全被隐藏起来了。
     * @param args
     */
    public static void main(String[] args) {
        Print p = new PrintBannerAdapter("Hello");
        p.printWeak();
        p.printStrong();
    }

}
