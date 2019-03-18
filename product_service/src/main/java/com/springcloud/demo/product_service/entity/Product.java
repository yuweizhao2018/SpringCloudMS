package com.springcloud.demo.product_service.entity;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    /**
     * 名称
     */
    private String name;
    /**
     * 价格
     */
    private String price;
    /**
     * 库存
     */
    private String store;

    public Product() {
    }

    public Product(int id, String name, String price, String store) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.store = store;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }
}
