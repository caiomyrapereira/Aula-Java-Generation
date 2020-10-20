package Lista04Exercicios;

import java.util.Scanner;

public class Exe03 {
	public static void main(String args[]) {
		/*
		 * Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela
		 * possui.
		 */

		int[][] arr = new int[2][2];
		int count = 0;
		Scanner ler = new Scanner(System.in);

		for (int line = 0; line < 2; line++) {
			for (int column = 0; column < 2; column++) {
				System.out.print("Digite um número qualquer: ");
				arr[line][column] = ler.nextInt();
			}
		}

		for (int line = 0; line < 2; line++) {
			for (int column = 0; column < 2; column++) {
				if (arr[line][column] > 10) {
					count++;
				}
			}
		}

		System.out.println("A quantidade de valores maiores que '10' é " + count);
	}
}
