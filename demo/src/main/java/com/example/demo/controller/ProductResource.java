package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;

@Controller
@RequestMapping("/api")
public class ProductResource {

	@Autowired
	ProductService productService;
	
	@GetMapping("/product")
	public ResponseEntity<List<Product>> getAllProduct() {
		return new ResponseEntity<List<Product>>(productService.findAll(), HttpStatus.OK);
	}
}
