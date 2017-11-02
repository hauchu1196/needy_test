package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Store;
import com.example.demo.service.StoreService;

@Controller
@RequestMapping("/api")
public class StoreResource {

	@Autowired
	StoreService storeService;
	
	@GetMapping("/store")
	public ResponseEntity<List<Store>> getAllStore() {
		return new ResponseEntity<List<Store>>(storeService.findAll(), HttpStatus.OK);
	}
}
