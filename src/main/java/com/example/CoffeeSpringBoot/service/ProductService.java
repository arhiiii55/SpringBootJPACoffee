package com.example.CoffeeSpringBoot.service;

import com.example.CoffeeSpringBoot.entity.Product;
import com.example.CoffeeSpringBoot.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    List<Product> getAllProduct();

    Product getProductById(int id);

    Product updateProductById(int id, Product product);

    Product deleteProductById(int id);

    List<Product> createProduct(Product product);
}
