package br.com.alura.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.alura.entities.Course;
import br.com.alura.entities.Lesson;

public class CourseTest2 {

	public static void main(String[] args) {

		Course javaCollections = new Course("Dominando as coleções do Java", "Paulo Silveira");

		javaCollections.add(new Lesson("Trabalhando com ArrayList", 21));
		javaCollections.add(new Lesson("Criando uma Aula", 20));
		javaCollections.add(new Lesson("Modelando coleções", 21));

		List<Lesson> immutableLessons = javaCollections.getLessons();
		System.out.println(immutableLessons);

		List<Lesson> mutableLessons = new ArrayList<>(immutableLessons);

		Collections.sort(mutableLessons);

		System.out.println(mutableLessons);

		System.out.println(javaCollections.getTotalTime());

		System.out.println(javaCollections);
	}
}
