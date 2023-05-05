package com.example.crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Market {
       @Id
       private int id;
       private String name;
       private String shopname;
       private String email;
       Market(){}
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
	public String getShopname() {
		return shopname;
	}
	public void setShopname(String shopname) {
		this.shopname = shopname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Market(int id, String name, String shopname, String email) {
		super();
		this.id = id;
		this.name = name;
		this.shopname = shopname;
		this.email = email;
	}
       
}
