package br.com.alura.bytbank.main;

import bytbank.entities.Account;
import bytbank.entities.Business;

public class Program {

	public static void main(String[] args) {
		Account account = new Business(123,123);
		
		account.deposit(200.0);
		
		System.out.println(account.getBalance());

	}

}
