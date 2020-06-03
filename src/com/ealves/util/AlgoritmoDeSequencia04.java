package com.ealves.util;

public class AlgoritmoDeSequencia04 {

	public static void main(String[] args) {

		Integer[] valores = new Integer[] { 1, 2, 3, 5, 7, 10, 11, 12, 13, 20 };

		int cont = 0;

		StringBuilder resultado = new StringBuilder();

		String compor = String.valueOf(valores[0]);
		String comporTwo = String.valueOf(valores[5]);

		for (int i = 0; i < valores.length; i++) {

			if (i < valores.length - 6) {

				if (valores[i] + 1 == valores[i + 1]) {
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

		for (int i = 0; i < valores.length; i++) {

			if (i < valores.length - 7) {

				if (valores[i] + 1 == valores[i] + 1) {
					cont++;
					continue;
				}

			}

			if (cont > 1) {
				resultado.append(valores[i]);

				resultado.append(" , ");
				cont = 0;
			}

		}

		for (int i = 0; i < valores.length; i++) {

			if (i < valores.length - 6) {

				if (valores[i] + 1 == valores[i] + 1) {
					cont++;
					continue;
				}

			}

			if (cont > 1) {
				resultado.append(valores[i]);

				resultado.append(" , ");
				cont = 0;
			}

		}

		for (int i = 0; i < valores.length; i++) {

			if (i < valores.length - 2) {

				if (valores[i] + 1 == valores[i] + 1) {
					cont++;
					continue;
				}

			}

			if (cont > 1) {
				resultado.append(comporTwo).append(" - ").append(valores[i]);
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
				resultado.append(valores[i]);
				cont = 0;
			}

		}

		System.out.println(resultado);

	}

}
