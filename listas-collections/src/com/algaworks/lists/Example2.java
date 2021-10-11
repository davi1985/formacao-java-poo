package com.algaworks.lists;

import java.util.ArrayList;
import java.util.List;

public class Example2 {

	public static void main(String[] args) {

		List<Client> clients = new ArrayList<>();

		clients.add(new Client(1L, "Davi Silva"));
		clients.add(new Client(2L, "Sarah Emilly"));
		clients.add(new Client(3L, "Joelma Braga"));

		System.out.println("Clientes: ");
		clients.forEach(client -> System.out.printf("ID: %d, Nome: %s \n", client.getId(), client.getName()));
	}

}
