package com.skillenza.CRUD.services;

import java.util.List;
import java.util.Optional;

import com.skillenza.CRUD.model.Product;
//import com.skillenza.CRUD.service.impl.Optional;

public interface ProductService {
	
	
	List<Product> get();
	 
	Optional<Product> get(int id);
	 
	 void save(Product employee);
	 
	 void delete(int id);

}
