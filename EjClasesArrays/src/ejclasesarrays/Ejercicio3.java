package ejclasesarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		int numero;

		int tabla1[] = new int[10];
		int tabla2[] = new int[10];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; 1 < 20; i++) {
			System.out.println("Introduce un número");
			numero = sc.nextInt();

			if (i < 10) {
				tabla1[i] = numero;

			} else if (i < 21) {
				tabla2[i - 10] = numero;

			}
		}

		if (Arrays.equals(tabla1, tabla2)) {
			System.out.println("Las tablas son iguales.");
		} else {
			System.out.println("Las tablas no son iguales.");
		}

		sc.close();
	}

}