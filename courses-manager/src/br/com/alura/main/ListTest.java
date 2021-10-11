package br.com.alura.main;

import java.util.ArrayList;
import java.util.Collections;

public class ListTest {

	public static void main(String[] args) {
		String lesson1 = "Conhecendo mais de listas";
		String lesson2 = "Modelando a classe Aula";
		String lesson3 = "Trabalhando com Cursos e Sets";

		ArrayList<String> lessons = new ArrayList<>();

		lessons.add(lesson1);
		lessons.add(lesson2);
		lessons.add(lesson3);

		System.out.println(lessons);

		System.out.println("----------------------");

		lessons.remove(0);

		System.out.println(lessons);

		System.out.println("----------------------");

		for (String lesson : lessons) {
			System.out.println("Aula: " + lesson);
		}

		System.out.println("----------------------");

		String firstLesson = lessons.get(0);

		System.out.println(firstLesson);

		System.out.println("----------------------");

		for (int i = 0; i < lessons.size(); i++) {
			System.out.println("aula: " + lessons.get(i));
		}

		System.out.println("----------------------");

		lessons.add("Aumentando o nosso conhecimento");
		lessons.forEach(lesson -> System.out.println("Percorrendo: " + lesson));

		Collections.sort(lessons);

		System.out.println("----------------------");

		lessons.forEach(lesson -> System.out.println(lesson));
	}
}
