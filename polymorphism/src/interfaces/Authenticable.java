package interfaces;

public abstract interface Authenticable{

	public void setPassword(int password);

	public boolean auth(int password);
}
