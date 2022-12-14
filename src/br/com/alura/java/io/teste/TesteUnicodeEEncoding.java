package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {

	public static void main(String[] args) throws UnsupportedEncodingException {
//		String s = "C";
//		System.out.println(s.codePointAt(0));
//		
//		Charset charset = Charset.defaultCharset();
//		System.out.println(charset.displayName() + " Display name");
//		
//		byte[] bytes = s.getBytes("windows-1252");
//		System.out.println(bytes.length + ", windows-1252");
//		String sNovo = new String(bytes);
//		System.out.println(sNovo);
//		
//		bytes = s.getBytes("UTF-16");
//		System.out.println(bytes.length + ", UTF-16");
//		
//		bytes = s.getBytes(StandardCharsets.US_ASCII);
//		System.out.println(bytes.length + ", US_ASCII");
		
		Charset utf8 = StandardCharsets.UTF_8;
		String s1 = "13º Órgão Oficial";
		byte[] bytes = s1.getBytes(utf8);
		String s2 = new String(bytes, utf8);
		System.out.println(s2);

	}

}
