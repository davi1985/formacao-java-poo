package inheritance;

public abstract class Employee {

	private String name;
	private String cpf;
	private double salary;

	public Employee() {
	}

	public abstract double getBonus(); // method without implementation

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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
