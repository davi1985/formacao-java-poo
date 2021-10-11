package inheritance;

import interfaces.Authenticable;

public class Admin extends Employee implements Authenticable {

	private AuthUtil authentication;
	
	public Admin() {
		this.authentication = new AuthUtil();
	}

	@Override
	public double getBonus() {
		return 50;
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
