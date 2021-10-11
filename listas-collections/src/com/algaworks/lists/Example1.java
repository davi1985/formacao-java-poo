package com.algaworks.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Example1 {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();

		names.add("Davi Silva");
		names.add("Joelma Braga");
		names.add("Sarah Emilly");

//		for (String string : names) {
//			System.out.println(string);
//		}

//		Anonymous class
//		names.forEach(new Consumer<String>() {
//			@Override
//			public void accept(String t) {
//				System.out.println(t);
//			}
//		});

//		lambda expression
		names.forEach(name -> System.out.println(name));
		
//		method reference
		names.forEach(System.out::println);
		
		
	}

}
