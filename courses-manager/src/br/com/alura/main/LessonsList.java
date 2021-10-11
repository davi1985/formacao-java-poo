package br.com.alura.main;

import br.com.alura.entities.Lesson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LessonsList {
    public static void main(String[] args) {

        Lesson a1 = new Lesson("Revisando as ArraysList", 21);
        Lesson a2 = new Lesson("Lista de objetos", 20);
        Lesson a3 = new Lesson("Relacionamento de listas e objetos", 15);

        ArrayList<Lesson> lessons = new ArrayList<>();
        lessons.add(a1);
        lessons.add(a2);
        lessons.add(a3);

        System.out.println(lessons);

        Collections.sort(lessons);

        System.out.println(lessons);

        Collections.sort(lessons, Comparator.comparing(Lesson::getTime));

        System.out.println(lessons);

        lessons.sort(Comparator.comparing(Lesson::getTime));
    }
}
