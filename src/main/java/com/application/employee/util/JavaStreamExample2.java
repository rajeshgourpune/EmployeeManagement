package com.application.employee.util;

import java.util.ArrayList;
import java.util.List;

public class JavaStreamExample2 {
    public static void main(String[] args) {
        List<ProductDTO> productsList = new ArrayList<ProductDTO>();
        //Adding Products using stream
        productsList.add(new ProductDTO(1,"HP Laptop",25000f));
        productsList.add(new ProductDTO(2,"Dell Laptop",30000f));
        productsList.add(new ProductDTO(3,"Lenevo Laptop",28000f));
        productsList.add(new ProductDTO(4,"Sony Laptop",28000f));
        productsList.add(new ProductDTO(5,"Apple Laptop",90000f));
       /* productsList.stream()
                .filter(p ->p.price> 28000)   // filtering price
                .map(pm ->pm.name)          // fetching price
                .forEach(System.out::println);  // iterating price*/
    }
}
class ProductDTO {
    int id;
    String name;
    float price;

    public ProductDTO(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
