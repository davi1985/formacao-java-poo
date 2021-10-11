package br.com.alura.java.io.main;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Program5 {

	public static void main(String[] args) throws IOException {

		PrintStream printStream = new PrintStream("text-example-test.txt");

		printStream.println("Testing writing with classes from java.io package");
		printStream.println();
		printStream.println();
		printStream.println("Davi Silva - Software Developer");

		printStream.close();
		
		PrintWriter printWriter= new PrintWriter("text-example-test.txt");

		printWriter.println("Testing writing with classes from java.io package");
		printWriter.println();
		printWriter.println();
		printWriter.println();
		printWriter.println("Davi Silva - Software Developer");

		printWriter.close();
	}

}
