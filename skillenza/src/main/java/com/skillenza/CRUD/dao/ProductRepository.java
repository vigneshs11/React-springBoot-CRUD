package com.skillenza.CRUD.dao;
//package org.springframework.boot.autoconfigure.h2;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skillenza.CRUD.model.Product;

//import antlr.collections.List;


public interface ProductRepository extends JpaRepository<Product,Integer> {
	
	
	

}
