package com.example.EkartProductManagement.controller;

import com.example.EkartProductManagement.model.Product;
import com.example.EkartProductManagement.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/getProducts")
    public List<Product> findAllProducts(){

        return productService.findAllProducts();
    }
    @GetMapping("/getProducts/{Id}")
    public Product findProductById(@PathVariable("Id") Integer id){
        return productService.findProductById(id);
    }
}
