package bytbank.main;

import bytbank.entities.Business;
import bytbank.entities.SavingsAccount;
import bytbank.exceptions.BalanceNegativeException;

public class Program {

	public static void main(String[] args) throws BalanceNegativeException {

		Business business = new Business(111, 111);
		business.deposit(100.00);

		SavingsAccount savingsAccount = new SavingsAccount(222, 222);
		savingsAccount.deposit(200.0);

		business.transfer(10.00, savingsAccount);

		System.out.println("Conta corrente: " + business.getBalance());
		System.out.println("Conta poupança: " + savingsAccount.getBalance());
	}

}
