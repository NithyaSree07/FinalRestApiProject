package com.nithya.onlinegroceryshopping.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;

import com.nithya.onlinegroceryshopping.entity.Product;



public interface ProductService {

	Product getProduct(int id);

	List<Product> getAllProduct();

	void updateProduct(Product product);

	void deleteProduct(int id);

	Product create(Product product);

	void deleteProductById(int productId);

	ResponseEntity<String> saveDetails(List<Product> product);

	Page<Product> getProductByField(int pageNo, int pageSize, String field);

	





	
}
