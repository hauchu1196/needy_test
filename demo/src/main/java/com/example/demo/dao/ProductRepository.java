package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Product;
import com.example.demo.model.Store;

@Repository
public class ProductRepository implements BaseRepository<Product> {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Product> findAll() {
		List<Product> result = jdbcTemplate.query(
				"SELECT id, storeId, name, image, createdBy, createdTime FROM products", 
				(rs, rowNum) -> new Product(rs.getInt("id"), rs.getInt("storeId"), rs.getString("name")
						, rs.getString("image"), rs.getInt("createdBy"), rs.getDate("createdTime")));
		return result;
	}

	@Override
	public Product findById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product add(Product t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product update(Product t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product delete(Product t) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
