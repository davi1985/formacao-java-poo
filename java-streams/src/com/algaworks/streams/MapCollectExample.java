package com.algaworks.streams;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.algaworks.streams.model.Category;
import com.algaworks.streams.model.Product;
import com.algaworks.streams.model.Product.Status;

public class MapCollectExample {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();

		Category drinksCategory = new Category("Bebidas");
		Category meatCategory = new Category("Carnes");
		Category othersCategory = new Category("Outros");

		products.add(new Product("Água 2L", Status.ACTIVE, new BigDecimal(9.9), drinksCategory));
		products.add(new Product("Picanha 1kg", Status.ACTIVE, new BigDecimal(109.5), meatCategory));
		products.add(new Product("Carvão", Status.INACTIVE, new BigDecimal(34.2), othersCategory));
		products.add(new Product("Cerveja 600ml", Status.ACTIVE, new BigDecimal(8.4), drinksCategory));
		products.add(new Product("Cupim 2kg", Status.ACTIVE, new BigDecimal(92), meatCategory));

//		List<Category> categories = new ArrayList<>();

//		for (Product product : products) {
//			if (product.getStatus().equals(Status.ACTIVE)) {
//				Category category = product.getCategory();
//
//				if (!categories.contains(category)) {
//					categories.add(category);
//				}
//			}
//		}

		List<Category> categories = products.stream()
				.filter(p -> p.getStatus().equals(Status.ACTIVE))
				.map(Product::getCategory)
				.distinct()
				.collect(Collectors.toList());

		System.out.println(categories);

	}

}
