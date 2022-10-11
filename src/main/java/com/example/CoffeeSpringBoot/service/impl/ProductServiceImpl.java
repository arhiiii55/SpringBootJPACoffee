package com.example.CoffeeSpringBoot.service.impl;

import com.example.CoffeeSpringBoot.entity.Product;
import com.example.CoffeeSpringBoot.entity.User;
import com.example.CoffeeSpringBoot.repository.ProductRepo;
import com.example.CoffeeSpringBoot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo ;

    @Override
    public List<Product> getAllProduct() {
        return productRepo.findAll();
    }

    @Override
    public Product getProductById(int id) {
        return productRepo.findById(id).stream().findFirst().orElse(null);
    }

    @Override
    public Product updateProductById(int id, Product product) {
        return null;
    }

    @Override
    public Product deleteProductById(int id) {
        return productRepo.deleteProductById(id);
    }

    @Override
    public List<Product> createProduct(Product product) {
        return null;
    }
}
