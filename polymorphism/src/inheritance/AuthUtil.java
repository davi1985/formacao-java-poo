package inheritance;

public class AuthUtil {
	private int password;

	public void setPassword(int password) {
		this.password = password;
	}

	public boolean auth(int password) {
		if (this.password == password) {
			return true;
		}
		return false;
	}
}
