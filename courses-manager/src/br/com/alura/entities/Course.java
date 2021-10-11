package br.com.alura.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Course {
	private String name;
	private String instructor;
	private List<Lesson> lessons = new ArrayList<Lesson>();
	private Set<Student> students = new HashSet<>();
	private Map<Integer, Student> enrollNumberToStudent = new HashMap<>();

	public Course(String name, String instructor) {
		this.name = name;
		this.instructor = instructor;
	}

	public List<Lesson> getLessons() {
		return Collections.unmodifiableList(lessons);
	}

	public String getInstructor() {
		return instructor;
	}

	public String getName() {
		return name;
	}

	public void add(Lesson lesson) {
		this.lessons.add(lesson);
	}

	public int getTotalTime() {
		return this.lessons.stream().mapToInt(Lesson::getTime).sum();
	}

	@Override
	public String toString() {
		return "[Curso: " + this.name + ", tempo total: " + this.getTotalTime() + " minutos.] \nAulas:" + this.lessons;
	}

	public void enroll(Student student) {
		this.students.add(student);
		this.enrollNumberToStudent.put(student.getRegistrationNumber(), student);
	}

	public Set<Student> getStudents() {
		return Collections.unmodifiableSet(students);
	}

	public boolean studentHasEnrolled(Student student) {
		return this.students.contains(student);
	}

	public Student getEnrollNumber(int number) {
		if (!enrollNumberToStudent.containsKey(number))
			throw new NoSuchElementException("Matrícula Não Encontrada.");

		return enrollNumberToStudent.get(number);
	}
}
