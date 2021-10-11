package bytbank.main;

import bytbank.entities.Account;
import bytbank.entities.Business;

// bytbank.main.Program3
public class Program3 {

	public static void main(String[] args) {

		Account account = new Business(123, 321);

		account.deposit(200.0);
		try {
			account.withdraw(210.0);
		} catch (Exception ex) {
			System.out.println("Saldo insuficente: " + ex.getMessage());
		}
		
		System.out.println(account.getBalance());

	}

}
