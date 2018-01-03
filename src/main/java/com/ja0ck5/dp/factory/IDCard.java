package com.ja0ck5.dp.factory;

public class IDCard extends Product {
    private String owner;

    public IDCard(String owner) {
        System.out.println(" 制作 " + owner + " 的 ID Card");
        this.owner = owner;
    }

    public void use() {
        System.out.println(" 使用 " + owner + " 的 ID Card");
    }

    public String getOwner() {
        return owner;
    }
}
