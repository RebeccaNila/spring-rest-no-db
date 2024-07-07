package com.nila.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class Product {

    private int productId;
    private String productName;
    private int price;

}
