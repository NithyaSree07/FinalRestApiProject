package com.nithya.onlinegroceryshopping.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nithya.onlinegroceryshopping.entity.Category;
import com.nithya.onlinegroceryshopping.service.CategoryService;

@RestController
public class CategoryController {
    
	@Autowired
	private CategoryService  categoryService; 
	//5
	@GetMapping("/category/{id}")
	public ResponseEntity<Category> getCategory(@PathVariable long id) {
		Category category = categoryService.getCategory(id);
		if (category == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
		return ResponseEntity.status(HttpStatus.OK).body(category);
	}
	//2
	@GetMapping("/getCategories")
    public ResponseEntity<List<Category>> getAllCategories() {
        List<Category> categories = categoryService.getAllCategories();
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }
	//4
	@GetMapping("/{categoryId}")
    public ResponseEntity<Category> getCategoryById(@PathVariable Long categoryId) {
        Optional<Category> category = categoryService.getCategoryById(categoryId);
        return category.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                       .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
	
//1
	@PostMapping("/category")
	public Category addCategory(@RequestBody  Category category) {
		return categoryService.create(category);
	}
//3
	@GetMapping
    public ResponseEntity<Page<Category>> getCategoryByField(@RequestParam int pageNo, @RequestParam int pageSize,@RequestParam String field) {   
        Page<Category>categories = categoryService.getCategoryByField(pageNo,pageSize,field);
        return ResponseEntity.ok(categories);
    }
	
}
