package com.example.CoffeeSpringBoot.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class UserDTO implements Serializable {
    private int idUserDTO;
    private String accountName;
    private String accountPassword;
    private String userName;
    private String email;
    private int phone;
    private String address;
    private RoleDTO roleDTO;
    private int actived;
    private Date createDate;
}
