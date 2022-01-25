package br.edu.infnet;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Teste {

	public static void main(String[] args) {
		
		List<Integer> numeros = new ArrayList<>();
		
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		numeros.add(6);
		numeros.add(7);
		numeros.add(8);
		numeros.add(9);
		
		
		for (Integer numero : numeros) {
			imprimirPares(numero);
			imprimirImpares(numero);
		}
		
		numeros.forEach(numero -> {
				imprimirPares(numero);
				imprimirImpares(numero);
			});

		numeros.stream().forEach(numero -> {
			imprimirPares(numero);
			imprimirImpares(numero);
		});
		
		numeros.stream().forEach(System.out::println);
		
		numeros.stream()
			.filter(numero -> (numero % 2) == 0)
			.map(numero -> numero + " é um elemento par")
			.forEach(System.out::println);
		
		System.out.println();
		
		numeros.stream()
			.filter(numero -> (numero % 2) != 0)
			.map(numero -> numero + " é um elemento impar")
			.forEach(System.out::println);
			
		System.out.println();

		List<String> strings = numeros.stream()
			.filter(numero -> (numero % 2) != 0)
			.map(numero -> numero + " é um elemento impar")
			.collect(Collectors.toList());

		strings.stream().forEach(System.out::println);
		
		
	}
	
	
	private static void imprimirPares(Integer elemento) {
		if ((elemento % 2) == 0) {
			System.out.println(elemento + " é um elemento par");
		}
	}
	
	private static void imprimirImpares(Integer elemento) {
		if ((elemento % 2) != 0) {
			System.out.println(elemento + " é um elemento impar");	
		}
	}
	

}
