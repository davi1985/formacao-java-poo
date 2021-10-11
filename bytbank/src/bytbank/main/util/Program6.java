package bytbank.main.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import bytbank.entities.Account;
import bytbank.entities.Business;
import bytbank.entities.Client;
import bytbank.entities.SavingsAccount;

public class Program6 {

	public static void main(String[] args) {
		Account cc1 = new Business(22, 33);
		Client clienteCC1 = new Client();
		clienteCC1.setName("Nico");
		cc1.setHolder(clienteCC1);
		cc1.deposit(333.0);

		Account cc2 = new SavingsAccount(22, 44);
		Client clienteCC2 = new Client();
		clienteCC2.setName("Guilherme");
		cc2.setHolder(clienteCC2);
		cc2.deposit(444.0);

		Account cc3 = new Business(22, 11);
		Client clienteCC3 = new Client();
		clienteCC3.setName("Paulo");
		cc3.setHolder(clienteCC3);
		cc3.deposit(111.0);

		Account cc4 = new SavingsAccount(22, 22);
		Client clienteCC4 = new Client();
		clienteCC4.setName("Ana");
		cc4.setHolder(clienteCC4);
		cc4.deposit(222.0);

		List<Account> list = new ArrayList<>();
		list.add(cc1);
		list.add(cc2);
		list.add(cc3);
		list.add(cc4);

		list.sort(new Comparator<Account>() {

			@Override
			public int compare(Account a1, Account a2) {

				return Integer.compare(a1.getNumber(), a2.getNumber());
			}

		});

		list.sort(new Comparator<Account>() {

			@Override
			public int compare(Account a1, Account a2) {
				String holderA1 = a1.getHolder().getName();
				String holderA2 = a2.getHolder().getName();

				return holderA1.compareTo(holderA2);
			}
		});

		System.out.println("-----------------AFTER---------------");
		for (Account account : list) {
			System.out.println(account + ", " + account.getHolder().getName());
		}

		Collections.sort(list);

		System.out.println("-----------------");
		for (Account account : list) {
			System.out.println(account);
		}

		list.sort(null);

		Comparator<Account> comp = new Comparator<Account>() {

			@Override
			public int compare(Account a1, Account a2) {
				String holderA1 = a1.getHolder().getName();
				String holderA2 = a2.getHolder().getName();

				return holderA1.compareTo(holderA2);
			}
		};

	}

}
