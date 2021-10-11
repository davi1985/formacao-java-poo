package bytbank.entities;

public class AccountsReferences {
	private Object[] references;
	private int positionFree;
	
	
	public AccountsReferences() {
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

	public Object getRef(int position) {
		return this.references[position];
	}	
}


















