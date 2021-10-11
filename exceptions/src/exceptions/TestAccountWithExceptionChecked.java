package exceptions;

public class TestAccountWithExceptionChecked {

	public static void main(String[] args) {
		Account c = new Account();
		try {
			c.deposit();
		} catch (CustomException e) {
			System.out.println("treatment ...");
		}
	}

}
