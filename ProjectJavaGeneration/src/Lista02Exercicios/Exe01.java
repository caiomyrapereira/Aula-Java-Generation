package Lista02Exercicios;

import java.util.Scanner;

public class Exe01 {
	public static void main(String args[]) {
		
		// 1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		
		Scanner ler = new Scanner(System.in);
		int n1, n2, n3;
			
		System.out.print("Digite um valor qualquer na variavel 'n1' :");
		n1 = ler.nextInt();
		System.out.print("Digite um valor qualquer na variavel 'n2' :");
		n2 = ler.nextInt();
		System.out.print("Digite um valor qualquer na variavel 'n3' :");
		n3 = ler.nextInt();
		
		if( (n1>n2) && (n1>n3) ) {
			System.out.printf("A variavel 'n1' � maior do que 'n2' e 'n3'.");
		}
		else if((n2>n1) && (n2>n3)) {
			System.out.printf("A variavel 'n2' � maior do que 'n1' e 'n3'.");
		}
		else if((n3>n1) && (n3>n2)) {
			System.out.printf("A variavel 'n3' � maior do que 'n1' e 'n2'.");
		}
		else {
			System.out.printf("\n O maior numero � inv�lido, pois existe dois ou tr�s numeros maiores que � iguais.");
		}
		
	}
}