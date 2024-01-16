package ejclasesarrays;

import java.util.Arrays;

public class Ejercicio7 {

	public static void main(String[] args) {

		int aleatorio = 0;

		int apuesta[] = new int[6];

		int ganadora[] = { 9, 21, 37, 38, 41, 49 };

		for (int i = 0; i < apuesta.length; i++) {
			aleatorio = (int) (1 + Math.random() * 49);
			apuesta[i] = aleatorio;
		}

		int contador = 0;

		Arrays.sort(apuesta);

		System.out.println("Apuesta -->       " + Arrays.toString(apuesta));
		System.out.println("Combinación ganadora... ");
		System.out.println("");
		System.out.println("Serie ganadora --> " + Arrays.toString(ganadora));

		for (int i = 0; i < apuesta.length; i++) {
			// Utilizamos la clase binarySearch para buscar el número en la combinación
			// ganadora
			int indice = Arrays.binarySearch(ganadora, apuesta[i]);

			// Si el índice es mayor o igual a 0, significa que encontramos un número.
			if (indice >= 0) {
				contador++;
			}
		}

		System.out.println("Número de aciertos: " + contador);

	}

}
