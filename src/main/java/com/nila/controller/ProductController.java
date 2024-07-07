package com.nila.controller;

import com.nila.model.Product;
import com.nila.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/products")
    public List<Product> getProducts(){
        return productService.getProducts();
    }

    @GetMapping("/products/{productId}")
    public Product getProductById(@PathVariable int productId){
        return productService.getProductById(productId);
    }

    @PostMapping("/product")
    public void addProduct(@RequestBody Product product){
        productService.addProduct(product);
    }

    @PutMapping("/product")
    public void updateProduct(@RequestBody Product product){
        productService.updateProduct(product);
    }
    @DeleteMapping("/products/{productId}")
    public String deleteProduct(@PathVariable int productId){
        return productService.deleteProduct(productId);
    }




}
