package com.example.CoffeeSpringBoot.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class ProductsInCart implements Serializable {
    private Product product;

    private int sale;
    private int quantity;
    private boolean selected;
}
