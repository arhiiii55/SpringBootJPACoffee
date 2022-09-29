package com.example.CoffeeSpringBoot.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
@Entity
@Table(name = "bill")
public class Bill implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_bill")
    private int id;

    @Column(name = "total")
    private int total;

    @Column(name = "payment")
    private int idPayment;

    @Column(name = "bill_status")
    private int idStatus;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "cart_id")
    private int idCart;

    @Column(name = "employee_id")
    private int user;

    @Column(name = "sale_code_id")
    private int saleCode;

    @Column(name = "note")
    private String note;
}
