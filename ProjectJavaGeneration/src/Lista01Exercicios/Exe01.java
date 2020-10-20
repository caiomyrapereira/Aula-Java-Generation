package Lista01Exercicios;

import java.util.Scanner;

public class Exe01 {
	public static void main(String args[]) {
		/*
		 * 1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
		 * dias e mostre-a expressa apenas em dias.
		 */

		Scanner ler = new Scanner(System.in);

		int anos, meses, dias;

		System.out.println("Digite sua idade somente em anos: ");
		anos = ler.nextInt();
		System.out.println("Digite sua idade somente  em meses: ");
		meses = ler.nextInt();
		System.out.println("Digite sua idade somente  em dias: ");
		dias = ler.nextInt();

		dias += (anos * 365) + (meses * 30);

		System.out.println("A sua idade em dias é  ");
		System.out.println(dias);

	}
}
