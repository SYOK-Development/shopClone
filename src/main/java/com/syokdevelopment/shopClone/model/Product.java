package com.syokdevelopment.shopClone.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Product {

    @Id
    private String id;
    private String name;
    private String category_id;
    private int stock;
    private double price;

    public Product(String id,String name,String category_id,int stock,double price){
        this.id = id;
        this.name= name;
        this.category_id = category_id;
        this.stock = stock;
        this.price = price;
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory_id() {
        return category_id;
    }

    public int getStock() {
        return stock;
    }

    public double getPrice() {
        return price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
