package bytbank.entities;

import bytbank.exceptions.BalanceNegativeException;

/**
 * Class that represent an Bybank account
 * 
 * @author Davi Silva
 * @version 0.1
 *
 */
public abstract class Account extends Object implements Comparable<Account> {

	protected double balance;
	private int agency;
	private int number;
	private Client holder;
	private static int total = 0;

	/**
	 * 
	 * @param agency
	 * @param number
	 */
	public Account(int agency, int number) {
		Account.total++;
		// System.out.println("O total de contas é " + Account.total);
		this.agency = agency;
		this.number = number;
		// this.balance = 100;
		// System.out.println("Estou criando uma conta " + this.number);
	}

	public abstract void deposit(double amount);

	/**
	 * Amount must be high that balance
	 * 
	 * @param amount
	 * @throws BalanceNegativeException
	 */
	public void withdraw(double amount) throws BalanceNegativeException {
		if (this.balance < amount) {
			throw new BalanceNegativeException("Saldo: " + this.balance + ", Valor: " + amount);
		}

		this.balance -= amount;
	}

	public void transfer(double amount, Account receiver) throws BalanceNegativeException {
		this.withdraw(amount);

		receiver.deposit(amount);
	}

	public double getBalance() {
		return this.balance;
	}

	public int getNumber() {
		return this.number;
	}

	/**
	 * 
	 * @param number
	 */

	public void setNumber(int number) {
		if (number <= 0) {
			System.out.println("Nao pode valor menor igual a 0");
			return;
		}

		this.number = number;
	}

	public int getAgency() {
		return this.agency;
	}

	public void setAgency(int agency) {
		if (agency <= 0) {
			System.out.println("Nao pode valor menor igual a 0");
			return;
		}

		this.agency = agency;
	}

	public void setHolder(Client holder) {
		this.holder = holder;
	}

	public Client getHolder() {
		return this.holder;
	}

	public static int getTotal() {
		return Account.total;
	}

	@Override
	public boolean equals(Object ref) {
		Account other = (Account) ref;

		if (this.agency != other.getAgency()) {
			return false;
		}

		if (this.number != other.getNumber()) {
			return false;
		}

		return true;
	}

	@Override
	public int compareTo(Account obj) {
		return Double.compare(this.balance, obj.balance);
	}

	@Override
	public String toString() {
		return "Account {" + "balance=" + balance + ", " + "agency=" + agency + ", " + "number=" + number + ","
				+ " holder=" + holder + "}";
	}

}
