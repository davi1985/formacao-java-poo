package bytbank.entities;

import bytbank.interfaces.Taxable;

public class TaxCalculator {

	private double totalTax;

	public void register(Taxable taxable) {
		double amount = taxable.getTaxAmount();
		this.totalTax += amount;
	}
	
	public double getTotalTax() {
		return totalTax;
	}
}
