package com.example.CoffeeSpringBoot.dto;

import com.example.CoffeeSpringBoot.entity.Bill;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class PaymentDTO implements Serializable {

    private int id;
    private String paymentType;

}
