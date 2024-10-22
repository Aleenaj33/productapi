package com.ust.rest.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
	private long productId;
	private String brand;
	
	private String description;
	private int qty;
	private int price;
	

}
