package com.example.EkartProductManagement.service;

import com.example.EkartProductManagement.model.Product;
//import com.example.EkartProductManagement.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

//    @Autowired
//    ProductRepository productRepository;

    public List<Product> findAllProducts(){

//        return productRepository.findAllProducts();
        ArrayList<Product> listOfProducts = new ArrayList<>();

        Product product1 = new Product();

        product1.setProdId(1L);
        product1.setDisplayName("Samsung");
        product1.setPrice(50);

        Product product2 = new Product();

        product2.setProdId(1L);
        product2.setDisplayName("Xiomi");
        product2.setPrice(70);

        listOfProducts.add(product1);
        listOfProducts.add(product2);

        return listOfProducts;

    }

    public String findProductById(Integer id) {

//        return productRepository.findProductById(id);
        return "hi";
    }
}
