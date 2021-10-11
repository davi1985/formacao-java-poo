package br.com.alura.main;

import br.com.alura.entities.Course;
import br.com.alura.entities.Lesson;
import br.com.alura.entities.Student;

public class SearchStudentIntoCourse {

	public static void main(String[] args) {
		Course javaCollections = new Course("Dominando as coleções do Java", "Paulo Silveira");

		javaCollections.add(new Lesson("Trabalhando com ArrayList", 21));
		javaCollections.add(new Lesson("Criando uma Aula", 20));
		javaCollections.add(new Lesson("Modelando coleções", 21));

		Student student1 = new Student("Rodrigo Turini", 34672);
		Student student2 = new Student("Guilherme Silveira", 5617);
		Student student3 = new Student("Mauricio Aniche", 17645);

		javaCollections.enroll(student1);
		javaCollections.enroll(student2);
		javaCollections.enroll(student3);

		System.out.println("Quem é o aluno com a matrícula 5617?");
		Student student = javaCollections.getEnrollNumber(56118);
		
		System.out.println(student);

	}

}
