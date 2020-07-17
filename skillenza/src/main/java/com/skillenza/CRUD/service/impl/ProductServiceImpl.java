package com.skillenza.CRUD.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.skillenza.CRUD.dao.ProductRepository;
import com.skillenza.CRUD.model.Product;
import com.skillenza.CRUD.services.ProductService;



@Service
public class ProductServiceImpl implements ProductService {
 
 @Autowired
 private ProductRepository productDao;
 
@Transactional
 @Override
 public List<Product> get() {
  return productDao.findAll() ;
 }
@Transactional
 @Override
 public Optional<Product> get(int id) {
	
  return productDao.findById(id) ;
 }
@Transactional
 @Override
 public void save(Product product) {
  productDao.save(product);
  
 }
@Transactional
 @Override
 public void delete(int id) {
  productDao.deleteById(id); ;
  
 }
}
