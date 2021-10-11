package inheritance;

import interfaces.Authenticable;

public class Manager extends Employee implements Authenticable {

	private AuthUtil authentication;

	public Manager() {
		this.authentication = new AuthUtil();
	}

	public double getBonus() {
		return super.getSalary();
	}

	@Override
	public void setPassword(int password) {
		this.authentication.setPassword(password);
	}

	@Override
	public boolean auth(int password) {
		return this.authentication.auth(password);
	}
}
