package com.example.CoffeeSpringBoot.entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
@Entity
@Table(name = "product")
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "product_name")
    private String productName;

    @Column(name = "type")
    private int typeProduct;

    @Column(name = "sale")
    private int sale;

    @Column(name = "image")
    private String image;

    @Column(name = "favorite")
    private boolean favorite;

    @Column(name = "actived")
    private boolean actived;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "price")
    private int price;
}
