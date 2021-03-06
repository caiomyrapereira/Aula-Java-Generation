package Lista04Exercicios;

import java.util.Scanner;

public class Exe02 {
	public static void main(String args[]) {

		/*
		 * 2- Fa�a um programa que receba 6 n�meros inteiros e mostre: � Os n�meros
		 * pares digitados; � A soma dos n�meros pares digitados; � Os n�meros �mpares
		 * digitados; � A quantidade de n�meros �mpares digitados.
		 */

		int[] numeros = new int[6];
		int[][] arr = new int[2][6];
		String[] digitados = { "", "" };
		int somaPar = 0, qtdImpar = 0;
		Scanner ler = new Scanner(System.in);

		for (int count = 0; count < 6; count++) {
			System.out.print("Digite um n�mero qualquer: ");
			numeros[count] = ler.nextInt();
		}

		for (int count = 0; count < 6; count++) {
			arr[(numeros[count] % 2)][count] = numeros[count];
			somaPar += arr[0][count];
			qtdImpar += numeros[count] % 2;
			digitados[numeros[count] % 2] += numeros[count] + ", ";
		}

		System.out.println("Os n�meros pares digitados: " + digitados[0]);
		System.out.println("A soma dos n�meros pares digitados:" + somaPar);
		System.out.println("Os n�meros Impares digitados: " + digitados[1]);
		System.out.println("A quantidade de n�meros �mpares digitados:" + qtdImpar);

	}
}
