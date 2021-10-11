package com.algaworks.streams.model;

public class Category {

	private String name;

	public Category(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return this.getName();
	}
}
