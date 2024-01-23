/*
 * @(#) $NAME.java       1.0         1/18/2024
 * Copyright (c) 2024  IUH. All rights reserved.
 */
package org.example.Manager_Product.entity;/*
 * @description:
 * @Author: Pham Sy Thai
 * Date:    1/18/2024
 * version: 1.0
 */


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Setter
@Getter
@Entity
@Table(name = "users")
public class User {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String name;

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public User(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public User() {
	}
	
	
}
