package com.example.CoffeeSpringBoot.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "payment")
public class Payment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_payment")
    private int id;

    @Column(name = "payment_type")
    private String paymentType;

    @JsonIgnore
    @OneToMany(mappedBy = "idPayment")
    private Set<Bill> bill ;
}
