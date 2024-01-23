/*
 * @(#) $NAME.java       1.0         1/18/2024
 * Copyright (c) 2024  IUH. All rights reserved.
 */
package org.example.Manager_Product.service;/*
 * @description:
 * @Author: Pham Sy Thai
 * Date:    1/18/2024
 * version: 1.0
 */

import org.example.Manager_Product.entity.Product;
import org.example.Manager_Product.reponsitory.ProductReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImlp implements ProductService{

    @Autowired
    ProductReponsitory productReponsitory;
    @Override
    public List<Product> findAllProducts() {
        List<Product> products = new ArrayList<>();
        products = productReponsitory.findAll();
        return products;
    }
    
    @Override
	public void addProducts(Product product) {
		productReponsitory.save(product);

	}

}
