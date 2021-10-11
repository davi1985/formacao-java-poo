package bytbank.main;

import bytbank.entities.Business;
import bytbank.entities.SavingsAccount;

public class Program5 {

	public static void main(String[] args) {
		Business business = new Business(22, 22);
		Object savingsAccount = new SavingsAccount(30, 30);
		
		System.out.println(savingsAccount.toString());
	}

}
