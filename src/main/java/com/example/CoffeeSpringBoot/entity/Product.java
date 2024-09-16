package com.example.CoffeeSpringBoot.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product")
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product")
    private int id;

    @Column(name = "product_name")
    private String productName;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "type" ,nullable=false)
    private TypeProduct typeProduct;

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
    // khoa

    @JsonIgnore
    @OneToMany(mappedBy = "product")
    private Set<ProductsInCart> productsInCart ;
}
