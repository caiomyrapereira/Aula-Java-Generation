package Lista01Exercicios;

import java.util.Scanner;

public class Exe02 {
	public static void main(String args[]) {
		/*
		 * 2. Fa�a um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
		 * expressa em anos, meses e dias.
		 */
		Scanner ler = new Scanner(System.in);

		int anos, meses, dias, idadeDias;

		System.out.println("Digite sua idade em dias: ");
		idadeDias = ler.nextInt();

		anos = (idadeDias / 365);
		meses = (idadeDias % 365) / 30;
		dias = (idadeDias % 365) % 30;

		System.out.println("A sua idade somente em anos: ");
		System.out.println(anos);
		System.out.println("A sua idade somente  em meses: ");
		System.out.println(meses);
		System.out.println("A sua idade somente  em dias: ");
		System.out.println(dias);

	}
}
