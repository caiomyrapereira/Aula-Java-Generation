package Lista03Exercicios;

import java.util.Scanner;

public class Exe02 {
	public static void main(String args[]) {

		/*
		 * Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		 */

		int[] arr = new int[2];
		int count, numero;
		Scanner ler = new Scanner(System.in);

		arr[0] = 0;
		arr[1] = 0;

		for (count = 0; count < 10; count++) {
			System.out.print("Digite um número qualquer: ");
			numero = ler.nextInt();
			arr[(numero % 2)]++;
		}

		System.out.printf("\nA quantidade de número Par é %d", arr[0]);
		System.out.printf("\nA quantidade de número Impar é %d", arr[1]);
	}
}
