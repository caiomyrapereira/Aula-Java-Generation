package Lista01Exercicios;

import java.util.Scanner;

public class Exe06 {
	public static void main(String args[]){
		/*
		  6. Construa um programa em c que, tendo como dados de entrada dois pontos
             quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a dist�ncia entre eles. A f�rmula
             que efetua tal c�lculo.
		*/
		
		Scanner ler = new Scanner(System.in);
		float x1, y1, x2, y2;
		double d;
		
		System.out.println("Digite a sua primeiro ponto do x1: ");
		x1 = ler.nextFloat();
		System.out.println("Digite a sua primeiro ponto do y1: ");
		y1 = ler.nextFloat();
		System.out.println("Digite a sua primeiro ponto do x2: ");
		x2 = ler.nextFloat();
		System.out.println("Digite a sua primeiro ponto do y2: ");
		y2 = ler.nextFloat();
		
		d = Math.sqrt( Math.pow((x2-x1),2) + Math.pow((y2-y1),2) );
		
		System.out.println("A distancia entre dois ponto �  ");
		System.out.println(d);

		
	}
}
