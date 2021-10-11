package bytbank.entities;

/**
 * Class that represent an Bybank client
 * 
 * @author Davi Silva
 * @version 0.1
 *
 */
public class Client {
	private String name;
	private String cpf;
	private String occupation;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
}
