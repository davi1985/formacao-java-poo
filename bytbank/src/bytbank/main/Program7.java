package bytbank.main;

import bytbank.entities.Account;
import bytbank.entities.AccountsBox;
import bytbank.entities.Business;

public class Program7 {
	public static void main(String[] args) {
		
		AccountsBox box = new AccountsBox();
		
		Account account1 = new Business(22, 33);
		box.add(account1);
		
		Account account2 = new Business(33, 44);
		box.add(account2);
		
		int size = box.getElementsQuantity();
		
		System.out.println(size);
		
		Account ref = box.getRef(2);
		
		System.out.println(ref.toString());
		
		
    }
}
