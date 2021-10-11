package bytbank.main.util;

import java.util.ArrayList;
import java.util.List;

import bytbank.entities.Account;
import bytbank.entities.Business;

public class Program3 {
	public static void main(String[] args) {

		// Generics
		List<Account> list = new ArrayList<Account>();

		Account c1 = new Business(22, 33);
		list.add(c1);

		Account c2 = new Business(33, 44);
		list.add(c2);
		
		Account c3 = new Business(33, 44);

		boolean hasItem = list.contains(c3);
		
		System.out.println(hasItem);
		
		for (Account account: list) {
			System.out.println(account);
		}

	}
}
















