package com.example.CoffeeSpringBoot.controller;

import com.example.CoffeeSpringBoot.entity.Test;
import com.example.CoffeeSpringBoot.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    public  TestService testService ;
    @GetMapping("/userView")
    public ResponseEntity<?> getListUser() {
        List<Test> tests = testService.getListUser();
        return ResponseEntity.ok(tests);
    }

    @PostMapping("/userView")
    public ResponseEntity<?> createUser(@RequestBody Test user) {
//        User user = new User();
//        user.setUserName("Tai");
//        user.setEmail("phamanhanh");
//        user.setPhone("00886");
        List<Test> users = testService.createUser(user);
        return ResponseEntity.ok(users);
    }

    @DeleteMapping("/userView/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable int id) {
        System.out.println(id);
        List<Test> users = testService.deleteUser(id);
        return ResponseEntity.ok(users);
    }
    @DeleteMapping("userDel/{id}")
    public ResponseEntity<?> deleteUserQuery(@PathVariable int id) {
        System.out.println(id);
        List<Test> users = testService.deleteUser(id);
        return ResponseEntity.ok(users);
    }

    @PutMapping("/userView/{id}")
    public ResponseEntity<?> updateUser(@PathVariable int id,@RequestBody Test test) {
        List<Test> users = testService.updateUser(id,test);
        return ResponseEntity.ok(users);
    }
}
