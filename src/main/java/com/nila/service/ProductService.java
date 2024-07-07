package com.nila.service;

import com.nila.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(new Product(101, "Iphone", 5000)
                                    ,new Product(102, "Camera", 70000)
                                    ,new Product(103, "Android", 3000)
                                ));


    public List<Product> getProducts(){
        return products;
    }


    public Product getProductById(int productId) {

        return products.stream()
                .filter(product -> product.getProductId() == productId)
                .findFirst().orElse(new Product(100, "No Item", 0));
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProduct(Product product) {

        int index = 0;
        for(int i=0; i<products.size(); i++){
            if(products.get(i).getProductId() == product.getProductId()){
                index = i;
            }
        }
        products.set(index, product);
    }

    public String deleteProduct(int productId) {

        int index = 0;
        for(int i=0; i<products.size(); i++){
            if(products.get(i).getProductId() == productId){
                index = i;
            }else{
                index = -1;
            }
        }
        if(index != -1)
            products.remove(index);

        return index == -1 ? "No record found!" : "Successfully Deleted!";
    }
}
