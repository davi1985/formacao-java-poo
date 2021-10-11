package main;

import inheritance.Manager;

public class Program1 {

	public static void main(String[] args) {
		Manager manager = new Manager();
		manager.setName("Davi Silva");
		manager.setCpf("000.001.002-44");
		manager.setSalary(5000.0);

		System.out.println(manager.getName());
		System.out.println(manager.getCpf());
		System.out.println(manager.getSalary());

		manager.setPassword(123);

		System.out.println(manager.auth(123));
		System.out.println(manager.getBonus());
	}

}
