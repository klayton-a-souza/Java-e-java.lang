package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {
	
	public static void main(String[] args) {
		
		ContaCorrente contaCorrente = new ContaCorrente(22, 33);
		System.out.println(contaCorrente.toString());
		
		ContaPoupanca contaPoupanca = new ContaPoupanca(44, 55);
		System.out.println(contaPoupanca.toString());
		
	}
	
	

}
