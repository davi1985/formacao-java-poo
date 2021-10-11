package inheritance;

public class BonusController {

	private double sum;

	public void register(Employee employee) {
		double bonus = employee.getBonus();

		this.sum += bonus;
	}
	
	public double getSum() {
		return sum;
	}
}
