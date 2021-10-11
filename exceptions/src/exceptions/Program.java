package exceptions;

public class Program {
	public static void main(String[] args) {

		try (MyConnection conn = new MyConnection()) {
			conn.getData();
		} catch (IllegalStateException ex) {
			System.out.println("Connection error");
		}

//		MyConnection connection = null;
//
//		try {
//			connection = new MyConnection();
//			connection.getData();
//		} catch (IllegalStateException e) {
//			System.out.println("Connection error");
//		} finally {
//			System.out.println("finally");
//
//			if (connection != null) {
//				connection.close();
//			}
//		}
	}
}
