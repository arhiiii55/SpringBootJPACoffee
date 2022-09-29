package com.example.CoffeeSpringBoot.entity;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

/**
 * @noinspection JpaAttributeTypeInspection
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
@Entity
@ToString
@Table(name = "user")
public class User implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private int idUser;

    @NonNull
    @Column(name = "account_name")
    private String accountName;

    @Column(name = "account_password")
    private String accountPassword;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private int phone;

    @Column(name = "address")
    private String address;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "role", referencedColumnName = "id_role")
    private Role idRole;

    @Column(name = "actived")
    private int actived;

    @Column(name = "create_date")
    private Date createDate;

//    @OneToOne(mappedBy = "cart")
//    private Cart cart;
}
