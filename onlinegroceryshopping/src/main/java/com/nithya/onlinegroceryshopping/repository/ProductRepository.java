package com.nithya.onlinegroceryshopping.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nithya.onlinegroceryshopping.entity.Product;

public interface ProductRepository  extends JpaRepository<Product,Integer>{

	@Query("SELECT p FROM Product p WHERE p.price <= :maxPrice")
    List<Product> findProductsByMaxPrice(float maxPrice);
}
