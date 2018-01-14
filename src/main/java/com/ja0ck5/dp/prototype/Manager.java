package com.ja0ck5.dp.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * 使用 Product 接口来复制实例
 * showcase 保存名字和实例的对应关系
 * register 会将 名字和product 注册到 showcase
 * Product Manager 中都没有出现 MessageBox 和 UnderlinePen 名字
 * 这是非常重要的.因为 一旦类中使用了别的类的名字,意味着该类就与其他类紧密地耦合在一起了
 */
public class Manager {

    private Map showcase = new HashMap();

    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }

    public Product create(String protoname) {
        Product product = (Product) showcase.get(protoname);
        return product.createClone();
    }

}
