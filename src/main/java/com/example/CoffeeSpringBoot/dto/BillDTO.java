package com.example.CoffeeSpringBoot.dto;

import com.example.CoffeeSpringBoot.entity.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class BillDTO implements Serializable {
    private int id;
    private int total;

    private PaymentDTO paymentDTO;
    private StatusDTO statusDTO;

    private Date createDate;
    private CartDTO cartDTO;

    private UserDTO userDTO;

    private SaleCodeDTO saleCodeDTO;

    private String note;
}
