package PooLista04Exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class List {
	public static void main(String args[]) {

		int opcao;
		ArrayList<String> estoque = new ArrayList<String>();
		Collection<String> frutas = Arrays.asList("banana", "maça", "limão", "tomate");
		String produto;
		Scanner ler = new Scanner(System.in);
		estoque.addAll(frutas);

		do {
			System.out.print("\n (4) Para apresentar todos os produtos da lista do estoque.");
			System.out.print("\n (3) Para atualizar um produto do estoque.");
			System.out.print("\n (2) Para remover um produto do estoque.");
			System.out.print("\n (1) Para armazenar um produto no estoque.");
			System.out.print("\n (0) Para sair.");
			System.out.print("\nEscolher uma opção:");
			opcao = ler.nextInt();
			switch (opcao) {
			case 1:
				System.out.print("\n--------------------------------------------------------");
				System.out.print("\nDigite um produto para armazenar no estoque:");
				produto = ler.next();
				estoque.add(produto);
				System.out.print("\n--------------------------------------------------------");
				break;
			case 2:
				System.out.print("\n--------------------------------------------------------");
				System.out.print("\nDigite um produto para armazenar no estoque:");
				produto = ler.next();
				estoque.remove(produto);
				System.out.print("\n--------------------------------------------------------");
				break;
			case 3:
				System.out.print("\n--------------------------------------------------------");
				System.out.println("\nDigite o nome do produto para atualizar:");
				String antigoProduto = ler.next();
				System.out.println("\nDigite o novo nome do produto:");
				String novoProduto = ler.next();
				estoque.set(estoque.indexOf(antigoProduto), novoProduto);
				System.out.print("\n--------------------------------------------------------");
				break;
			case 4:
				System.out.print("\n--------------------------------------------------------");
				System.out.println(estoque);
				System.out.print("\n--------------------------------------------------------");
				break;
			}

		} while (opcao != 0);
	}
}
