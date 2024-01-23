/*
 * @(#) $NAME.java       1.0         1/18/2024
 * Copyright (c) 2024  IUH. All rights reserved.
 */
package org.example.Manager_Product.reponsitory;/*
 * @description:
 * @Author: Pham Sy Thai
 * Date:    1/18/2024
 * version: 1.0
 */

import org.example.Manager_Product.entity.Product;
import org.example.Manager_Product.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public class OrderReponsitory {
	private Product product;
	private User user;
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
