package Lista01Exercicios;

import java.util.Scanner;

public class Exe08 {
	public static void main(String args[]) {

		/*
		 * 8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
		 * percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
		 * Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
		 * escrever um sistema que leia o custo de f�brica de um carro e escreva o custo
		 * ao consumidor.
		 */

		Scanner ler = new Scanner(System.in);
		float precoTotal, distribuidor, impostos, custoFabrica;

		System.out.println("Digite o custo da Fabrica do carro: ");
		custoFabrica = ler.nextFloat();

		distribuidor = (float) (custoFabrica * 0.28);
		impostos = (float) (custoFabrica * 0.45);
		precoTotal = custoFabrica + distribuidor + impostos;

		System.out.println("O custo do distribuidor � ");
		System.out.println(distribuidor);
		System.out.println("O custo do impostos � ");
		System.out.println(impostos);
		System.out.println("O custo do pre�o total � ");
		System.out.println(precoTotal);

	}
}
