package bytbank.main.util;

import java.util.ArrayList;

import bytbank.entities.Account;
import bytbank.entities.Business;

public class Program2 {
	public static void main(String[] args) {

		// Generics
		ArrayList<Account> list = new ArrayList<Account>();

		Account c1 = new Business(22, 33);
		list.add(c1);

		Account c2 = new Business(33, 44);
		list.add(c2);

		System.out.println(list.size());

		Account ref = (Account) list.get(0);

		System.out.println(ref.toString());

		list.remove(0);
		System.out.println(list.size());

		Account c3 = new Business(22, 33);
		list.add( c3);

		Account c4 = new Business(22, 33);
		list.add(c4);

		
		
		for (Account account: list) {
			System.out.println(account);
		}

	}
}
















