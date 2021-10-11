package com.algaworks.streams;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

import com.algaworks.streams.model.Product;
import com.algaworks.streams.model.Product.Status;

public class ReduceExample {

	public static void main(String[] args) {

		List<Product> products = new ArrayList<>();

		products.add(new Product("Água 2L", Status.ACTIVE, new BigDecimal(9.9)));
		products.add(new Product("Picanha 1kg", Status.ACTIVE, new BigDecimal(109.5)));
		products.add(new Product("Carvão", Status.INACTIVE, new BigDecimal(34.2)));
		products.add(new Product("Cerveja 600ml", Status.ACTIVE, new BigDecimal(8.4)));
		products.add(new Product("Cupim 2kg", Status.ACTIVE, new BigDecimal(92)));

//		BigDecimal total = BigDecimal.ZERO;
//
//		for (Product product : products) {
//			if (product.getStatus().equals(Status.ACTIVE)) {
//				total = total.add(product.getPrice());
//			}
//		}

//		BinaryOperator<BigDecimal> operation = (x, y) -> x.add(y);

		BigDecimal total = products.stream().filter(p -> p.getStatus().equals(Status.ACTIVE)).map(Product::getPrice)
				.reduce(BigDecimal.ZERO, BigDecimal::add);

		System.out.println(total);
	}

}
