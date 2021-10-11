package com.algaworks.streams;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

import com.algaworks.streams.model.Product;
import com.algaworks.streams.model.Product.Status;

public class FilterForeEachExample {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();

		products.add(new Product("Água 2L", Status.ACTIVE, new BigDecimal(9.9)));
		products.add(new Product("Picanha 1kg", Status.ACTIVE, new BigDecimal(109.5)));
		products.add(new Product("Carvão", Status.INACTIVE, new BigDecimal(34.2)));
		products.add(new Product("Cerveja 600ml", Status.ACTIVE, new BigDecimal(8.4)));
		products.add(new Product("Cupim 2kg", Status.ACTIVE, new BigDecimal(92)));

//		for (Product product : products) {
//			if(product.getName().startsWith("C")) {
//				product.inactivate();
//			}
//		}

		products.stream()
			.filter(p -> p.getName().startsWith("C"))
			.forEach(Product::inactivate);		
	}

}