package com.aycelik.designpatterns.chainOfResponsibility;

public class Product {
    public String id;
    public String name;
    public String merchant;
    public int quantity;
    public long price;

    public Product(String id, String name, String merchant, int quantity, long price) {
        this.id = id;
        this.name = name;
        this.merchant = merchant;
        this.quantity = quantity;
        this.price = price;
    }
}
