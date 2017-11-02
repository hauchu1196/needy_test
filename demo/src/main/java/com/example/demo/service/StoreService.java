package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.StoreRepository;
import com.example.demo.model.Store;

@Service
@Transactional
public class StoreService {
	@Autowired
	StoreRepository storeRepository;	

	public List<Store> findAll() {
		return storeRepository.findAll();
	}
}
