package br.com.alura.java.io.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class Program3 {

	public static void main(String[] args) throws IOException {

		// read
//		 InputStream fileInput = new FileInputStream("lorem.txt");
		InputStream fileInput = System.in;
		Reader inputReader = new InputStreamReader(fileInput);
		BufferedReader bufferedReader = new BufferedReader(inputReader);

//		OutputStream outputStream = new FileOutputStream("text-example-test.txt");
		OutputStream outputStream = System.out;
		Writer writer = new OutputStreamWriter(outputStream);
		BufferedWriter bufferedWriter = new BufferedWriter(writer);

		String row = bufferedReader.readLine();

		while (row != null && !row.isEmpty()) {
			bufferedWriter.write(row);
			bufferedWriter.newLine();
			bufferedWriter.flush();
			row = bufferedReader.readLine();
		}

		bufferedReader.close();
		bufferedWriter.close();
	}

}
