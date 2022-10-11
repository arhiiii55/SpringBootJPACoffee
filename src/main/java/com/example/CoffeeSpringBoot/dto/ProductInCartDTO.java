package com.example.CoffeeSpringBoot.dto;

import com.example.CoffeeSpringBoot.entity.Cart;
import com.example.CoffeeSpringBoot.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class ProductInCartDTO implements Serializable {
    private int cartId;
    private int productId;
    private CartDTO cartDTO;
    private ProductDTO productDTO;

    private int sale;

    private int quantity;
}
