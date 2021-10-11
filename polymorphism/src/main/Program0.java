package main;

import inheritance.Employee;
import inheritance.Manager;

public class Program0 {

	public static void main(String[] args) {

		Employee davi = new Manager();
		davi.setName("Davi Silva");
		davi.setCpf("223.245.555-44");
		davi.setSalary(2600.00);

		System.out.println(davi.getName());
		System.out.println(davi.getBonus());

	}

}
