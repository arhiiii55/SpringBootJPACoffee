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
public class ProductInBillKey implements Serializable {
    @Column(name = "bill_id")
    int billId;

    @Column(name = "product_id")
    int productId;
}
