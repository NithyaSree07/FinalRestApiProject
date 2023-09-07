package com.nithya.onlinegroceryshopping.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.nithya.onlinegroceryshopping.entity.Product;
import com.nithya.onlinegroceryshopping.repository.ProductRepository;
import org.springframework.http.ResponseEntity;


@Service
public class ProductServiceImplementation implements ProductService {

	@Autowired
	private ProductRepository productrepository;

	@Override
	public Product getProduct(int id) {
		Optional<Product> optional=productrepository.findById(id);
		if(optional.isEmpty()) {
			return null;
		}
		return optional.get();
	}

	@Override
	public Product create(Product product) {
	    return productrepository.save(product);
		 
	}
	
	@Override
	public ResponseEntity<String> saveDetails(List<Product> product) {
	    productrepository.saveAll(product);
	    return ResponseEntity.ok("data added");
		 
	}
	
	
	@Override
	public List<Product> getAllProduct(){
		return productrepository.findAll();
	}

	@Override
	public void updateProduct(Product product) {
		productrepository.save(product);
		
	}

	@Override
	public void deleteProduct(int id) {
		Optional<Product> optional = productrepository.findById(id);
		if(!optional.isEmpty()) {
		  productrepository.delete(optional.get());
		}
	}
	
	@Override
	 public void deleteProductById(int productId) {
	        productrepository.deleteById(productId);
	    }
	
	
	//@override of paging and sorting method
	@Override
	 public Page<Product> getProductByField(int pageNo, int pageSize,String field) {
		Sort sort= Sort.by(field);
	        Pageable pageable = PageRequest.of(pageNo, pageSize, sort);
	        return productrepository.findAll(pageable);
	    }
	
	
	}
