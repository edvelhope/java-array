package main;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.print("Metti un numero: ");
		int numero = scanner.nextInt();

		boolean caso = false;
		int length = array.length;
		for (int i = 0; i < length; i++) {
			if (numero == array[i]) {
				System.out.print(i);
				caso = true;
			}

		}
		if (!caso) {
			System.out.print("Non trovato");
		}
		scanner.close();

	}

}
