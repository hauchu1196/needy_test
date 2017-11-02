package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.ProductRepository;
import com.example.demo.model.Product;

@Service
@Transactional
public class ProductService {
	@Autowired
	ProductRepository productRepository;	

	public List<Product> findAll() {
		return productRepository.findAll();
	}
}
