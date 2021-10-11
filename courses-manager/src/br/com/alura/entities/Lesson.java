package br.com.alura.entities;

public class Lesson implements Comparable<Lesson> {
	
	private final String title;
	private final int time;

	public Lesson(String title, int time) {
		this.title = title;
		this.time = time;
	}

	public String getTitle() {
		return title;
	}

	public int getTime() {
		return time;
	}

	@Override
	public String toString() {
		return "Aula: " + this.title + ", " + this.time + " minutos";
	}

	@Override
	public int compareTo(Lesson obj) {
		return this.title.compareTo(obj.title);
	}
	
}



