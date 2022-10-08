package com.example.CoffeeSpringBoot.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
@Entity
@Table(name = "productsinbill")
public class ProductInBill implements Serializable {

    @EmbeddedId
    private ProductInBillKey productInBillKey;

    @JsonIgnore
    @ManyToOne
    @MapsId("billId")
    @JoinColumn(name = "bill_id", nullable = false)
    private Bill bill ;

    @JsonIgnore
    @ManyToOne
    @MapsId("productId")
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @Column(name = "sale")
    private int sale;
    @Column(name = "quantity")
    private int quantity;
}
