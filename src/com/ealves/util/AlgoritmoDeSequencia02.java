package com.ealves.util;

public class AlgoritmoDeSequencia02 {
	
	public static void main(String[] args) {

		Integer[] valores = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int cont = 0;

		StringBuilder resultado = new StringBuilder();

		String compor = String.valueOf(valores[0]);
		String comporTwo = String.valueOf(valores[5]);

		for (int i = 0; i < valores.length; i++) {

			if (i < valores.length - 6) {

				if (valores[i] + 1 == valores[i] + 1) {
					cont++;
					continue;
				}		
				
			}

			if (cont > 1) {
				resultado.append(compor).append(" - ").append(valores[i]);
				resultado.append(" , ");
				cont = 0;
			}

		}
		
		
		for (int y = 0; y < valores.length; y++) {

			if (y < valores.length - 1) {

				if (valores[y] + 1 == valores[y] + 1) {
					cont++;
					continue;
				}
				
			}

			if (cont > 1) {
				resultado.append(comporTwo).append(" - ").append(valores[y]);
				cont = 0;
			}

		}

		System.out.println(resultado);

	}

}
