package br.com.alura.java.io.main;

import java.nio.charset.Charset;

public class Program7 {

	public static void main(String[] args) throws Exception {
		String s = "C";
		
		System.out.println(s.codePointAt(0));
		
		Charset charset = Charset.defaultCharset();
		
		System.out.println(charset.displayName());
				
	}

}
