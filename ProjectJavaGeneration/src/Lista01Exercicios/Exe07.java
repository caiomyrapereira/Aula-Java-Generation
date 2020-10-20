package Lista01Exercicios;

import java.util.Scanner;

public class Exe07 {
	public static void main(String args[]) {
		// 7. Um sistema de equações lineares do tipo:

		Scanner ler = new Scanner(System.in);
		float a, b, c, d, e, f, x, y;

		System.out.println("Digite um valor qualquer na variavel 'A' :");
		a = ler.nextInt();
		System.out.println("Digite um valor qualquer na variavel 'B' :");
		b = ler.nextInt();
		System.out.println("Digite um valor qualquer na variavel 'C' :");
		c = ler.nextInt();
		System.out.println("Digite um valor qualquer na variavel 'D' :");
		d = ler.nextInt();
		System.out.println("Digite um valor qualquer na variavel 'E' :");
		e = ler.nextInt();
		System.out.println("Digite um valor qualquer na variavel 'F' :");
		f = ler.nextInt();

		x = (c * e - b * f) / (a * e - b * d);
		y = (a * f - c * d) / (a * e - b * d);

		System.out.println("O valor do x é ");
		System.out.println(x);
		System.out.println("O valor do y é ");
		System.out.println(y);

	}
}
