package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
//		String nome = "Jhonatan Maciel";
		
//		ObjectOutputStream oos = new ObjectOutputStream(new  FileOutputStream("object.bin"));
//		oos.writeObject(nome);
//		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new  FileInputStream("object.bin"));
		String nome = (String) ois.readObject();
		ois.close();
		System.out.println(nome);
		
		
	}

}
