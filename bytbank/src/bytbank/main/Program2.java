package bytbank.main;

import bytbank.entities.Business;
import bytbank.entities.LifeInsurance;
import bytbank.entities.TaxCalculator;

public class Program2 {
	public static void main(String[] args) {
		Business business = new Business(122, 122);
		business.deposit(100.00);
		
		LifeInsurance lifeInsurance = new LifeInsurance();
		
		TaxCalculator taxCalculator = new TaxCalculator();
		taxCalculator.register(business);
		taxCalculator.register(lifeInsurance);
		
		System.out.println(taxCalculator.getTotalTax());
		
	}
}
