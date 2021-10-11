package br.com.alura.entities;

public class Student {
	private String name;
	private int registrationNumber;

	public Student(String name, int registrationNumber) {
		if (name == null) {
			throw new NullPointerException("Name can not be null!");
		}

		this.name = name;
		this.registrationNumber = registrationNumber;
	}

	public String getName() {
		return name;
	}

	public int getRegistrationNumber() {
		return registrationNumber;
	}

	@Override
	public String toString() {
		return "[Aluno: " + this.name + ", matrícula: " + this.registrationNumber + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Student other = (Student) obj;

		return this.name.equals(other.getName());
	}

	@Override
	public int hashCode() {
		return this.name.hashCode();
	}

}
