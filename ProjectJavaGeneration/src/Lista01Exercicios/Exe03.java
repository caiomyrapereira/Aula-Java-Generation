package Lista01Exercicios;

import java.util.Scanner;

public class Exe03 {
	public static void main(String args[]) {
		/*
		 * 3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
		 * expressa em segundos e mostre-o expresso em horas, minutos e segundos.
		 */

		Scanner ler = new Scanner(System.in);

		int totalSegs, horas, mins, segs;

		System.out.println("Digite a dura��o de um evento em uma f�brica em segundos: ");
		totalSegs = ler.nextInt();

		horas = (totalSegs / 60) / 60;
		mins = (totalSegs / 60) % 60;
		segs = totalSegs % 60;

		System.out.println("Horas:");
		System.out.println(horas);
		System.out.println("Minutos:");
		System.out.println(mins);
		System.out.println("Segundos:");
		System.out.println(segs);

	}
}
