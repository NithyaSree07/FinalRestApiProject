package com.nithya.onlinegroceryshopping.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import com.nithya.onlinegroceryshopping.entity.Category;

public interface CategoryService {

	Category getCategory(long id);

	List<Category> getAllCategories();

	Optional<Category> getCategoryById(Long categoryId);

	Category create(Category category);

	Page<Category> getCategoryByField(int pageNo, int pageSize, String field);

	
}
