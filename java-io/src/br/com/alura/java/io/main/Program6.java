package br.com.alura.java.io.main;

import java.io.File;
import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(new File("contas.csv"));

		while (scanner.hasNextLine()) {
			String row = scanner.nextLine();
			System.out.println(row);

			Scanner rowScanner = new Scanner(row);
			rowScanner.useDelimiter(",");
			
			System.out.println();
		}

		scanner.close();
	}

}
