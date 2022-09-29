package com.example.CoffeeSpringBoot.repository;

import com.example.CoffeeSpringBoot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("UserRepository")
public interface UserRepository extends JpaRepository<User, Integer> {

    void deleteUserByIdUser(int id);

}
