package bytbank.exceptions;

public class BalanceNegativeException extends Exception {

	public BalanceNegativeException(String msg) {
		super(msg);
	}
}
