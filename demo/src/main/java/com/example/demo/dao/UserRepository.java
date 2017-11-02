package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;

@Repository
public class UserRepository implements BaseRepository<User> {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<User> findAll() {
		List<User> result = jdbcTemplate.query("SELECT id, username, password, name FROM users",
				(rs, rowNum) -> null);
		return result;
	}

	@Override
	public User findById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User add(User t) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("INSERT INTO users(username, password, name) VALUES (?, ?, ?)", t.getUsername(),
				t.getPassword(), t.getName());
		return null;
	}

	@Override
	public User update(User t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User delete(User t) {
		// TODO Auto-generated method stub
		return null;
	}

	public Optional<User> findByUsername(String username) {
		String sql = "SELECT * FROM users WHERE username = ?";
		User user = jdbcTemplate.queryForObject(
				sql, new Object[] {username}, 
				(rs, rowNum) -> new User(rs.getInt("id"), rs.getString("username"), rs.getString("password"),
						rs.getString("name")));
		System.out.println(user.toString());
		return Optional.of(user);
	}

}
