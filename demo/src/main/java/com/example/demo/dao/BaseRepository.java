package com.example.demo.dao;

import java.util.List;

public interface BaseRepository<T> {
	List<T> findAll();
	T findById();
	T add(T t);
	T update(T t);
	T delete(T t);
}
