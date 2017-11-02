package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.UserRepository;
import com.example.demo.model.User;

@Service
@Transactional
public class UserService {

	@Autowired
	UserRepository userRepository;	

	public List<User> findAll() {
		return userRepository.findAll();
	}
}
