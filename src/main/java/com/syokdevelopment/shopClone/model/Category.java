package com.syokdevelopment.shopClone.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;

@Setter
@Getter
@Entity
@NoArgsConstructor
public class Category {

    @Id
    private String id;
    private String name;
    private ArrayList<Product> productList;

    public Category(String id,String name,ArrayList<Product> productList){
        this.id = id;
        this.name = name;
        this.productList = productList;
    }

    public String getCategoryName() {
        return name;
    }

    public String getCategoryId() {
        return id;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }
}
