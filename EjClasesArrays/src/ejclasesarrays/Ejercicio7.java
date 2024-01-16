package ejclasesarrays;

import java.util.Arrays;

public class Ejercicio7 {

	public static void main(String[] args) {

		int aleatorio;

		int primitiva[] = new int[6];

		int apuesta[] = {9, 21, 37, 38, 41, 49};

		for (int i = 0; i < primitiva.length; i++) {
			aleatorio = (int) (1 + Math.random() * 49);
			primitiva[i] = aleatorio;
		}

		System.out.println(Arrays.toString(primitiva));

	}

}
