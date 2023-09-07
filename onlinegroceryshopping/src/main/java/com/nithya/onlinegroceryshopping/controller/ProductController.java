package com.nithya.onlinegroceryshopping.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nithya.onlinegroceryshopping.entity.Product;
import com.nithya.onlinegroceryshopping.service.ProductService;



@RestController
public class ProductController {
  
	@Autowired
	public ProductService productService;
	
//2
	@GetMapping("/product/{id}")
	public ResponseEntity<Product> getProduct(@PathVariable int id) {
		Product product = productService.getProduct(id);
		if (product == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
		return ResponseEntity.status(HttpStatus.OK).body(product);
	}
	
	
	@PostMapping("/product")
	public Product addProduct(@RequestBody Product product) {
		return productService.create(product);
	}
	
	
	@PostMapping("/addproducts")
	public ResponseEntity<String> addProducts(@RequestBody List<Product> product) {
//		return productService.saveDetails(product);
//		System.err.println(product.toString());
		return productService.saveDetails(product);
	}
	//1
	@GetMapping("/product")
	public ResponseEntity<List<Product>> getAllProducts(){
		List<Product> product = productService.getAllProduct();
		return ResponseEntity.status(HttpStatus.OK).body(product);
	}
 
	
	@PutMapping("/product")
	public ResponseEntity<String> updateProduct(@RequestBody Product product) {
		productService.updateProduct(product);
		return ResponseEntity.ok("Updated");
	}
	
	@DeleteMapping("/product")
	public ResponseEntity<String> deleteProduct(@RequestBody Product product) {
		productService.deleteProduct(product.getId());
		return ResponseEntity.ok("Deleted");
	}
	
	//3
	@DeleteMapping("/product/{productId}")
    public ResponseEntity<String> deleteProductById(@PathVariable int productId) {
        productService.deleteProductById(productId);
        return new ResponseEntity<>("Product deleted successfully", HttpStatus.OK);
    }
	
	
	
	//paging and sorting
	@GetMapping("/getpage")
    public ResponseEntity<Page<Product>> getProductByField(@RequestParam int pageNo, @RequestParam int pageSize,@RequestParam String field) {   
        Page<Product>products = productService.getProductByField(pageNo,pageSize,field);
        return ResponseEntity.ok(products);
    }
	
	
	
}