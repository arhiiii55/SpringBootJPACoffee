package com.example.CoffeeSpringBoot.dto;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class RoleDTO implements Serializable {
    private int idRoleDTO;
    private String roleNameDTO;
}
