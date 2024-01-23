package org.example.Manager_Product.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	float price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Product(int id, float price) {
		super();
		this.id = id;
		this.price = price;
	}

	public Product() {
		super();
	}

}