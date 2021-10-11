package br.com.alura.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class StudentTest {

	public static void main(String[] args) {

		Collection<String> students = new HashSet<>();
		students.add("Rodrigo Turini");
		students.add("Alberto Souza");
		students.add("Nico Steppat");
		students.add("Sergio Lopes");
		students.add("Renan Saggio");
		students.add("Mauricio Aniche");
		
//		students.forEach(student -> System.out.println(student));
		
		boolean hasPaulo = students.contains("Paulo Silveira");
		students.remove("Sergio Lopes");

		System.out.println(hasPaulo);
//		System.out.println(students);
		
		List<String> studentsList = new ArrayList<>(students);
		Collections.sort(studentsList);
		
		System.out.println(studentsList);
		

	}

}
