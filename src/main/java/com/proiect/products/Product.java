/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proiect.products;

import java.util.Objects;

/**
 *
 * @author adrian
 */
public class Product {
    private String name;
    private int id;
    private int price;
    

    public Product(String name, int price) {
        this.price = price;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", price=" + price + '}';
    }

    public void setName(String name) {
        this.name = name;
    }
}
