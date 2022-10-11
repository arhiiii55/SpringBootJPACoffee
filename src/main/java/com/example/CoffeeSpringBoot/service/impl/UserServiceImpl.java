package com.example.CoffeeSpringBoot.service.impl;

import com.example.CoffeeSpringBoot.entity.Role;
import com.example.CoffeeSpringBoot.entity.User;
import com.example.CoffeeSpringBoot.repository.RoleRepo;
import com.example.CoffeeSpringBoot.repository.UserRepository;
import com.example.CoffeeSpringBoot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepo roleRepo;
//    private static ArrayList<Role> roles = new ArrayList<Role>();
    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(int id) {
        return userRepository.findById(id).stream().findFirst().orElse(null);
    }

    @Override
    public User updateUserById(int id, User user) {
        User userRepo = getUserById(id);
        if (userRepo != null) {
            userRepo = user;
            userRepository.save(userRepo);
        }
        return userRepo;
    }

    @Override
    @Transactional
    public List<User> deleteUserById(int id) {
        userRepository.deleteUserByIdUser(id);
        return getAllUser();
    }

    @Override
    public List<User> createUser(User user) {
        userRepository.save(user);
        return userRepository.findAll();
    }
//------------------------ work with dto and entity
    @Override
    public List<User> getAllUserDTO() {
        return userRepository.findAll();
    }

    @Override
    public User getUserByIdDTO(int id) {
        return userRepository.findById(id).stream().findFirst().orElse(null);
    }

    @Override
    public List<Role> getRole() {

        return roleRepo.findAll();
    }
    @Override
    public Role getRoleById(int id) {
        return roleRepo.findById(id).stream().findFirst().orElse(null);
    }
}
