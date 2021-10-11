package inheritance;

import interfaces.Authenticable;

public class Client implements Authenticable {

	private AuthUtil authentication;

	public Client() {
		this.authentication = new AuthUtil();
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
