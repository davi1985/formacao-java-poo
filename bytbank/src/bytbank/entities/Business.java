package bytbank.entities;

import bytbank.exceptions.BalanceNegativeException;
import bytbank.interfaces.Taxable;

public class Business extends Account implements Taxable {

	public Business(int agency, int number) {
		super(agency, number);
	}

	@Override
	public void withdraw(double amount) throws BalanceNegativeException {
		double finalAmount = amount + 0.2;

		super.withdraw(finalAmount);
	}

	@Override
	public void deposit(double amount) {
		super.balance += amount;
	}

	@Override
	public double getTaxAmount() {
		return super.balance * 0.01;
	}
}
