package com.algaworks.streams.model;

import java.math.BigDecimal;

public class Product {
	public enum Status {
		ACTIVE, INACTIVE
	}

	private String name;
	private Status status;
	private BigDecimal price;
	private Category category;

	public Product(String name, Status status, BigDecimal price) {
		super();
		this.name = name;
		this.status = status;
		this.price = price;
	}

	public Product(String name, Status status, BigDecimal price, Category category) {
		super();
		this.name = name;
		this.status = status;
		this.price = price;
		this.category = category;
	}

	public void inactivate() {
		System.out.println("Inativando " + getName());
		this.status = Status.INACTIVE;
	}

	public String getName() {
		return name;
	}

	public Category getCategory() {
		return category;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public Status getStatus() {
		return status;
	}
}
