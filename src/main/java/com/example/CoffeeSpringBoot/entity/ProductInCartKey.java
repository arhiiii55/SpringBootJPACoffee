package com.example.CoffeeSpringBoot.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable
public class ProductInCartKey implements Serializable {

    @Column(name = "cart_id")
    int cartId;

    @Column(name = "product_id")
    int productId;
}
