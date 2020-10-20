package Lista03Exercicios;

import java.util.Scanner;

public class Exe03 {
	public static void main(String args[]) {
		/*
		 * 3. Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos
		 * de 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		 * idade for =-99. (WHILE)
		 */

		int idade = 0, adolecente = 0, idoso = 0;
		Scanner ler = new Scanner(System.in);

		while (idade < 99) {
			System.out.printf("Digite sua idade :");
			idade = ler.nextInt();

			if ((idade > 0) && (idade < 21)) {
				adolecente++;
			} else if (idade > 50) {
				idoso++;
			}
		}

		System.out.printf("\nTotal de pessoas com menos de '21 anos' é %d", adolecente);
		System.out.printf("\nTotal de pessoas com menos de '21 anos' é %d", idoso);

	}
}
