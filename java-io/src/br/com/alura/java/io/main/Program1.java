package br.com.alura.java.io.main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Program1 {

	public static void main(String[] args) throws IOException {

		// output files flow
		InputStream fileInput = new FileInputStream("lorem.txt");

		Reader inputReader = new InputStreamReader(fileInput);

		BufferedReader bufferedReader = new BufferedReader(inputReader);

		String row = bufferedReader.readLine();
		
		while(row != null) {
			System.out.println(row);
			row = bufferedReader.readLine();
		}

		bufferedReader.close();
	}

}
