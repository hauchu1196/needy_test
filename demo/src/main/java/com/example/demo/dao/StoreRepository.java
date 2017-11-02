package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Store;

@Repository
public class StoreRepository implements BaseRepository<Store>{

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<Store> findAll() {
		List<Store> result = jdbcTemplate.query(
				"SELECT id, name, address FROM stores", 
				(rs, rowNum) -> new Store(rs.getInt("id"), rs.getString("name"), rs.getString("address")));
		return result;
	}

	@Override
	public Store findById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Store add(Store t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Store update(Store t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Store delete(Store t) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
