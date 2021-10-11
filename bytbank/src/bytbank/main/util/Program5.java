package bytbank.main.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import bytbank.entities.Account;
import bytbank.entities.Business;

public class Program5 {
	public static void main(String[] args) {
		Account cc1 = new Business(22, 33);
		cc1.deposit(333.0);

		Account cc2 = new Business(22, 44);
		cc2.deposit(444.0);

		Account cc3 = new Business(22, 11);
		cc3.deposit(111.0);

		Account cc4 = new Business(22, 22);
		cc4.deposit(222.0);

		List<Account> list = new ArrayList<>();
		list.add(cc1);
		list.add(cc2);
		list.add(cc3);
		list.add(cc3);
		
		for (Account account : list) {
			System.out.println(account.toString());
		}

		AccountNumberComparator comparator = new AccountNumberComparator();
		
		list.sort(comparator);

		System.out.println("-----------------AFTER---------------");
		for (Account account : list) {
			System.out.println(account.toString());
		}
	}
}

class AccountNumberComparator implements Comparator<Account> {

	@Override
	public int compare(Account a1, Account a2) {
		if (a1.getNumber() < a2.getNumber()) {
			return -1;
		}

		if (a1.getNumber() > a2.getNumber()) {
			return 1;
		}

		return 0;
	}

}
