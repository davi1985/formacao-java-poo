package inheritance;

import interfaces.Authenticable;

public class InternSystem {
	private int password = 222;
	
	public void auth(Authenticable authenticable) {
		boolean authentication = authenticable.auth(this.password);
		
		if(authentication) {
			System.out.println("Login Permitido");
		} else {
			System.out.println("Login NÃO-Permitido");
		}
	}
}