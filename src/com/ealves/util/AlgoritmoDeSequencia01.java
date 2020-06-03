package com.ealves.util;

public class AlgoritmoDeSequencia01 {
	
	public static void main(String[] args) {

		Integer[] valores = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int cont = 0;

		StringBuilder resultado = new StringBuilder();

		String compor = String.valueOf(valores[0]);

		for (int i = 0; i < valores.length; i++) {

			if (i < valores.length - 1) {

				if (valores[i] + 1 == valores[i + 1]) {
					cont++;
					continue;
				}

			}

			if (cont > 1) {
				resultado.append(compor).append(" - ").append(valores[i]);
				cont = 0;
			}

		}

		System.out.println(resultado);

	}

}
