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
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductReponsitory extends JpaRepository<Product, Integer> {
	
}
