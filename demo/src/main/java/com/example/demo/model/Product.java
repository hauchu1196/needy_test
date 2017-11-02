package com.example.demo.model;

import java.sql.Date;

public class Product {
	private int id;
	private int storeId;
	private String name;
	private String image;
	private int createdBy;
	private Date date;
	
	public Product(int id, int storeId, String name, String image, int createdBy, Date date) {
		super();
		this.id = id;
		this.storeId = storeId;
		this.name = name;
		this.image = image;
		this.createdBy = createdBy;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
