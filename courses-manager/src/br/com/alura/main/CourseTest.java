package br.com.alura.main;

import br.com.alura.entities.Course;
import br.com.alura.entities.Lesson;

public class CourseTest {
	
	public static void main(String[] args) {
	
		Course javaCollections = new Course("Dominando as coleções do Java", "Paulo Silveira");
		
		javaCollections.add(new Lesson("Trabalhando com ArrayList", 21));
		javaCollections.add(new Lesson("Criando uma Aula", 20));
		javaCollections.add(new Lesson("Modelando coleções", 21));
		
		
		System.out.println(javaCollections.getLessons());
	}

}
