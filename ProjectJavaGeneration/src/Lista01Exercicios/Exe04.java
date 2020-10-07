package Lista01Exercicios;

import java.util.Scanner;

public class Exe04 {
	public static void main(String args[]) {
		/*
		 4. Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
            calcule a seguinte expressão: D = R+S/2; R = (A+B)^2; S=(B+C)^2.
		*/
		
		Scanner ler = new Scanner(System.in);
		int a, b, c;
		double s, r, d;
			
		System.out.println("Digite um valor qualquer na variavel 'A' :");
		a = ler.nextInt();
		System.out.println("Digite um valor qualquer na variavel 'B' :");
		b = ler.nextInt();
		System.out.println("Digite um valor qualquer na variavel 'C' :");
		c = ler.nextInt();
		
		r = Math.pow((a+b),2);
		s = Math.pow((b+c),2);
		d = (r+s)/2;
		
		System.out.println("O valor da variavel 'R' :");
		System.out.println(r);
		System.out.println("O valor da variavel 'S' :");
		System.out.println(s);
		System.out.println("O valor da variavel 'D' :");
		System.out.println(d);
		
		
	}
}
