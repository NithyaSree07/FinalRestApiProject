package com.nithya.onlinegroceryshopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nithya.onlinegroceryshopping.entity.Category;


public interface CategoryRepository extends JpaRepository<Category,Long>{

	
}
