package com.dxc.model;

import org.springframework.data.annotation.Id;

public class Products {

	@Id
	private String id;
	private String name;
	private String category;
	private String brand;
	private int Price;
	
	
	public Products(String name, String category, String brand, int price) {
		super();
		this.name = name;
		this.category = category;
		this.brand = brand;
		Price = price;
	}
	
	public Products() {
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	
	
	
	
}
