package Lista03Exercicios;

import java.util.Scanner;

public class Exe06 {
	public static void main(String args[]) {
		/*
		 * 6. Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
		 * final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
		 * 0(zero).(DO...WHILE)
		 */

		Scanner ler = new Scanner(System.in);
		int numero = 0, soma = 0, count = 0;
		float media;

		do {
			System.out.printf("Digite um n�mero qualquer:");
			numero = ler.nextInt();
			if (numero % 3 == 0) {
				soma += numero;
				count++;
			}
		} while (numero != 0);

		media = soma / count;

		System.out.printf("%f", media);

	}

}
