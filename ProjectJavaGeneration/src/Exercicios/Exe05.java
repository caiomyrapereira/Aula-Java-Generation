package Exercicios;

import java.util.Scanner;

public class Exe05 {
	public static void main(String args[]) {
		/*
		  5. Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
             aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
             respectivamente.
		*/
		
		Scanner ler = new Scanner(System.in);
		
		float n1, n2, n3, peso,media;
		
		System.out.println("Digite a sua primeira nota: ");
		n1 = ler.nextFloat();
		System.out.println("Digite a sua segunda nota: ");
		n2 = ler.nextFloat();
		System.out.println("Digite a sua Terceira nota: ");
		n3 = ler.nextFloat();
		
		peso = 2+3+5;
		media = (n1*2+n2*3+n3*5)/peso;
		
		System.out.println("A sua m�dia � ");
		System.out.println(media);
		
		
	}
}
