package com.application.employee.util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamExample {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));
        System.out.println("ProductList :::>>>"+productsList);
        List<String> pricesList =  productsList.stream()
                .filter(procutPrice ->procutPrice.price> 2000)   // filtering price
                .map(pm ->pm.name)          // fetching price
                .collect(Collectors.toList());
        System.out.println("PricesList :::>>>"+pricesList);
    }

}

class Product{
    int id;
    String name;
    float price;
    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
