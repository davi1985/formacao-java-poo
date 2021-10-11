package br.com.alura.java.io.main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program4 {

	public static void main(String[] args) throws IOException {

//
//		OutputStream outputStream = new FileOutputStream("text-example-test.txt");
//
//		Writer writer = new OutputStreamWriter(outputStream);
//

		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("text-example-test.txt"));

		bufferedWriter.write("Testing writing with classes from java.io package");
		bufferedWriter.newLine();
		bufferedWriter.newLine();

		bufferedWriter.write("Davi Silva - Software Developer");

		bufferedWriter.close();

	}

}
