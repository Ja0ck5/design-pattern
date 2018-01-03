package com.ja0ck5.dp.factory;

/**
 * 用 模板方法模式(Template Method) 来构建生成实例的工厂 这就是 工厂方法模式
 * <p>
 * 只要是工厂方法模式 在生成实例的时候就一定会使用到 模板方法模式
 * <p>
 * 将实例生成交给子类
 */
public abstract class Factory {

    protected abstract Product createProduct(String owner);

    protected abstract void registerProduct(Product product);

    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

}
