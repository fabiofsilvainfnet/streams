package br.edu.infnet;

import java.util.HashSet;
import java.util.Set;

public class Sets {

	public static void utilizandoSets() {

		Set<Integer> numeros = new HashSet<>();
		
		boolean resultado;
		numeros.add(1);
		resultado = numeros.add(2);
//		System.out.println(resultado ? "adicionou" : "não adicionou");
		
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		numeros.add(6);
		numeros.add(7);
		numeros.add(8);
		numeros.add(9);
		numeros.add(10);
		numeros.add(11);
		numeros.add(12);
		numeros.add(13);
		numeros.add(14);
		numeros.add(15);
		numeros.add(16);

		resultado = numeros.add(2);
//		System.out.println(resultado ? "adicionou" : "não adicionou");

		numeros.stream().forEach(System.out::println);
		
		numeros.stream()
			.filter(numero -> (numero % 2) != 0)
			.map(numero -> numero + " é um elemento impar")
			.forEach(System.out::println);
	
	}
	
	
	
	private static void imprimirImpares(Integer elemento) {
		if ((elemento % 2) != 0) {
			System.out.println(elemento + " é um elemento impar");	
		}
	}

}
