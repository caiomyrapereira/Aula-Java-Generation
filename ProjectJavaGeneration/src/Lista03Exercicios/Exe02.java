package Lista03Exercicios;

import java.util.Scanner;

public class Exe02 {
	public static void main(String args[]) {

		/*
		 * Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		 */

		int[] arr = new int[2];
		int count, numero;
		Scanner ler = new Scanner(System.in);

		arr[0] = 0;
		arr[1] = 0;

		for (count = 0; count < 10; count++) {
			System.out.print("Digite um n�mero qualquer: ");
			numero = ler.nextInt();
			arr[(numero % 2)]++;
		}

		System.out.printf("\nA quantidade de n�mero Par � %d", arr[0]);
		System.out.printf("\nA quantidade de n�mero Impar � %d", arr[1]);
	}
}
