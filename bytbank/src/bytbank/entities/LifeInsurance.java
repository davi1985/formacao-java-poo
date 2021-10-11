package bytbank.entities;

import bytbank.interfaces.Taxable;

public class LifeInsurance implements Taxable {

	@Override
	public double getTaxAmount() {
		return 42;
	}

}
