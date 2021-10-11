package bytbank.entities;

public class AccountsBox {
	private Account[] references;
	private int positionFree;
	
	
	public AccountsBox() {
		this.references = new Account[10];
		this.positionFree = 0;
	}

	public void add(Account ref) {
		this.references[this.positionFree] = ref;
		this.positionFree++;
	}
	
	public int getElementsQuantity() {
		return this.positionFree;
	}

	public Account getRef(int position) {
		return this.references[position];
	}	
}
