package com.example.CoffeeSpringBoot.controller;

import com.example.CoffeeSpringBoot.entity.Role;
import com.example.CoffeeSpringBoot.entity.User;
import com.example.CoffeeSpringBoot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    // trả về danh sách user lấy từ your database in Mysql
    @GetMapping("/users")
    public ResponseEntity<?> getListUser() {
        List<User> users = userService.getAllUser();
        return ResponseEntity.ok(users);
    }

    @PostMapping("/users")
    public ResponseEntity<?> createUser(@RequestBody User user) {
        List<User> users = userService.createUser(user);
        return ResponseEntity.ok(users);
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable int id) {
        System.out.println(id);
        List<User> users = userService.deleteUserById(id);
        return ResponseEntity.ok(users);
    }

//    @GetMapping("/users/{id}")
//    public ResponseEntity<?> getIdOfUser(@PathVariable int id) {
//        User users = userService.getUserById(id);
//        if (users == null) {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found!");
//        }
//        System.out.println(users.getRole().getRoleName());
//
//        return ResponseEntity.status(HttpStatus.OK).body(users);
//    }

    @PutMapping("/users/{id}")
    public ResponseEntity<?> updateUser(@PathVariable int id, @RequestBody User user) {
        if (id == user.getIdUser()) {
            User users = userService.updateUserById(id, user);
            if (users == null) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found!");
            }
            return ResponseEntity.status(HttpStatus.OK).body(users);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("ID user not the same!");
    }
    @GetMapping("/Role")
    public ResponseEntity<?> getRole() {
        List<Role> roles = userService.getRole();
        return ResponseEntity.ok(roles);
    }
}
