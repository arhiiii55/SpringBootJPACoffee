package com.example.CoffeeSpringBoot.repository;

import com.example.CoffeeSpringBoot.entity.ProductInBill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductInBillRepo extends JpaRepository<ProductInBill, Integer> {
}
