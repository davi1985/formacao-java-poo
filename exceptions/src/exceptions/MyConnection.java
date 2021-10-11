package exceptions;

public class MyConnection implements AutoCloseable {

	public MyConnection() {
		System.out.println("Starting connection...");
		throw new IllegalStateException();
	}

	public void getData() {
		System.out.println("Get data from database");
		throw new IllegalStateException();
	}

	@Override
	public void close() {
		System.out.println("Close connection...");
	}
}
