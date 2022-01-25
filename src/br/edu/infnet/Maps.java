package br.edu.infnet;

import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void utilizandoMaps() {
		
		Map<Integer, String> valores = new HashMap<>();
		
		valores.put(1, "Um");
		valores.put(2, "Dois");
		valores.put(3, "Três");
		valores.put(4, "Quatro");
		valores.put(5, "Cinco");
		valores.put(6, "Seis");
		valores.put(7, "Sete");
		valores.put(8, "Oito");
		valores.put(9, "Nove");
		valores.put(10, "Dez");

//		valores.put(10, "Onze");
//		System.out.println(valores.containsKey(1));
//		System.out.println(valores.containsKey(11));
//		System.out.println(valores.containsValue("Cinco"));
//		System.out.println(valores.containsValue("Cinquenta"));
		
		for (Integer chave : valores.keySet()) {
			System.out.println(valores.get(chave));
		}
		
		valores.forEach((chave, valor) -> System.out.println(valor));
		
		//valores.entrySet().stream().forEach((chave,valor) -> System.out::println);
		
		
	}
	
}
