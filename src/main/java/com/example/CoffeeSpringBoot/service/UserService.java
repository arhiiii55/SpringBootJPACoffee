package com.example.CoffeeSpringBoot.service;

import com.example.CoffeeSpringBoot.entity.Role;
import com.example.CoffeeSpringBoot.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public interface UserService {

    List<User> getAllUser();

    User getUserById(int id);

    User updateUserById(int id, User user);

    List<User> deleteUserById(int id);

    List<User> createUser(User user);

    List<User> getAllUserDTO();
    User getUserByIdDTO(int id);
    List<Role> getRole();
    Role getRoleById(int id);

}
