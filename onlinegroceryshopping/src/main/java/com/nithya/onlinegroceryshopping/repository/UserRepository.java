package com.nithya.onlinegroceryshopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nithya.onlinegroceryshopping.entity.User;

public interface UserRepository extends JpaRepository<User,Integer>{

}