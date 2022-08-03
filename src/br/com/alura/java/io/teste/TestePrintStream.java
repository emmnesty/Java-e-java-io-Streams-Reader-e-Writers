package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintStream;

public class TestePrintStream {

	public static void main(String[] args) throws IOException {

		PrintStream ps = new PrintStream("lorem4.txt");
		
		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		ps.println();
		ps.println();
		ps.println("teste blabla bla ");

		ps.close();

	}
}