package br.com.bytebank.banco.test;

public class TesteString {

	public static void main(String[] args) {

		String nome = "Klayton"; // object literal

		System.out.println("Testando o replace com char: " + nome.replace('n', 'N'));
		System.out.println("Testando o replace com charSequence: " + nome.replace("Kla", "kLA"));
		System.out.println("Testando o toUpperCase: " + nome.toUpperCase());
		System.out.println("Testando o charAt, exibindo o valor que se encontra no index 3: " + nome.charAt(3));
		System.out.println("Testando o substring: " + nome.substring(4));
		System.out.println("Testando o length: " + nome.length()); 
		System.out.println("Testando isEmpty: " + nome.isEmpty());
		
		String nomeComEspacos = "     Klayton      ";
		
		System.out.println("Testando o medoto trim(): " + nomeComEspacos.trim());
		
		System.out.println("Testando o metodo contains: " + nome.contains("la"));
	}

}
