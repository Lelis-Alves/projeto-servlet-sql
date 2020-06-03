package com.ealves.util;

public class AlgoritmoDeSequencia05 {

	public static void main(String[] args) {

		Integer[] valores = new Integer[] { 1, 3, 5, 6, 9, 10, 11, 12 };

		int cont = 0;

		StringBuilder resultado = new StringBuilder();

		String compor = String.valueOf(valores[0]);
		String comporTwo = String.valueOf(valores[1]);
		String comporThree = String.valueOf(valores[2]);
		String comporFor = String.valueOf(valores[4]);

		for (int i = 0; i < valores.length; i++) {

			if (i < valores.length - 1) {

				if (valores[i] + 1 == valores[i + 1]) {
					cont++;
					continue;
				}

			}

			if (cont > 1) {
				resultado.append(compor);
				resultado.append(" , ");
				cont = 0;
			}

		}

		for (int i = 0; i < valores.length; i++) {

			if (i < valores.length - 3) {

				if (valores[i] + 1 == valores[i + 1]) {
					cont++;
					continue;
				}

			}

			if (cont > 1) {
				resultado.append(comporTwo);
				resultado.append(" , ");
				cont = 0;
			}

		}

		for (int i = 0; i < valores.length; i++) {

			if (i < valores.length - 5) {

				if (valores[i] + 1 == valores[i] + 1) {
					cont++;
					continue;
				}

			}

			if (cont > 1) {
				resultado.append(comporThree).append(" - ").append(valores[i]);
				resultado.append(" , ");
				cont = 0;
			}

		}

		for (int i = 0; i < valores.length; i++) {

			if (i < valores.length - 1) {

				if (valores[i] + 1 == valores[i] + 1) {
					cont++;
					continue;
				}

			}

			if (cont > 1) {
				resultado.append(comporFor).append(" - ").append(valores[i]);
				cont = 0;
			}

		}

		System.out.println(resultado);

	}

}
