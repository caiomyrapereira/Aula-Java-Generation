package Lista02Exercicios;

import java.util.Scanner;

public class Exe04 {
	public static void main(String args[]) {
		/*
		 * 4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se
		 * este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo;
		 * se for �mpar exiba o n�mero elevado ao quadrado.
		 */

		Scanner ler = new Scanner(System.in);
		int numero;

		System.out.print("Digite um n�mero qualquer: ");
		numero = ler.nextInt();

		if (numero % 2 == 0) {
			System.out.printf("\nO n�mero %d%s", numero, " � Par");
			System.out.printf("\nA raiz quadrado do n�mero %d%s%f", numero, " � ", Math.sqrt(numero));
		} else {
			System.out.printf("\nO n�mero %d%s", numero, " � Impar");
			System.out.printf("\nO n�mero %d%s%f", numero, " a elevando ao quadrado � %f ", Math.pow(numero, 2));
		}
	}
}
