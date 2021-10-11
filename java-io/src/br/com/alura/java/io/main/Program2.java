package br.com.alura.java.io.main;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Program2 {

	public static void main(String[] args) throws IOException {

		// input files flow
		OutputStream outputStream = new FileOutputStream("text-example-test.txt");

		Writer writer= new OutputStreamWriter(outputStream);

		BufferedWriter bufferedWriter = new BufferedWriter(writer);

		bufferedWriter.write("Testing write with BuffereWriter Java class from java.io package");
		bufferedWriter.newLine();
		bufferedWriter.newLine();
		bufferedWriter.write("End Test - Davi Silva - Software Developer");
		

		bufferedWriter.close();
	}

}
