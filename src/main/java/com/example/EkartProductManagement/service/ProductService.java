package com.example.EkartProductManagement.service;

import com.example.EkartProductManagement.model.Product;
import com.example.EkartProductManagement.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> findAllProducts(){

        return productRepository.findAllProducts();

    }

    public Product findProductById(Integer id) {
        return productRepository.findProductById(id);
    }
}
