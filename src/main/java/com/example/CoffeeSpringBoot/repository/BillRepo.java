package com.example.CoffeeSpringBoot.repository;

import com.example.CoffeeSpringBoot.entity.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillRepo extends JpaRepository<Bill , Integer> {
}
