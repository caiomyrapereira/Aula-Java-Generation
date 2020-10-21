package CollectionLista01Exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class List {
	public static boolean checkLetters(String str) {
		return str.matches("[a-zA-Z]+");
	}

	public static boolean checkProduct(ArrayList<String> d, String name) {
		return d.contains(name);
	}

	public static void main(String args[]) {

		int opcao;
		ArrayList<String> estoque = new ArrayList<String>();
		Collection<String> frutas = Arrays.asList("banana", "ma�a", "lim�o", "tomate");
		String produto = "", novoProduto = "";
		boolean value;
		Scanner ler = new Scanner(System.in);
		estoque.addAll(frutas);

		do {
			do {
				System.out.print("\n-----------------------------------------------------------");
				System.out.print("\n (4) Para apresentar todos os produtos da lista do estoque.");
				System.out.print("\n (3) Para atualizar um produto do estoque.");
				System.out.print("\n (2) Para remove um produto do estoque.");
				System.out.print("\n (1) Para armazenar um produto no estoque.");
				System.out.print("\n (0) Para sair.");
				System.out.print("\nEscolher uma op��o:");
				opcao = ler.nextInt();
				System.out.print("\n-----------------------------------------------------------");
			} while (!((opcao >= 0) && (opcao <= 4)));
			switch (opcao) {
			case 1:
				produto = "test";
				boolean permitirProduto = true;
				do {
					System.out.print("\n--------------------------------------------------------");
					// mensage de aviso!
					if (!checkLetters(produto))
						System.out.print("\nAten��o!! \nN�o poder� armazenar n�meros.\n");
					if (checkProduct(estoque, produto))
						System.out.print("\nAten��o!! \n N�o pod�ra armazenar produto repetido.\n");

					System.out.print("\nDigite um produto para armazenar no estoque:");
					produto = ler.next();

					permitirProduto = checkLetters(produto) && !checkProduct(estoque, produto);
					System.out.print("\n--------------------------------------------------------");
				} while (!permitirProduto);

				estoque.add(produto);
				break;
			case 2:
				do {
					System.out.print("\n--------------------------------------------------------\n");
					if (!checkProduct(estoque, produto) && !(produto == ""))
						System.out.print("\nO produto '" + produto + "' n�o existe no estoque.\n");

					System.out.print("\nDigite um produto para remove no estoque:");
					produto = ler.next();
					System.out.print("\n--------------------------------------------------------");
				} while (!checkProduct(estoque, produto));

				estoque.remove(produto);
				break;
			case 3:
				produto = "";
				novoProduto="test";
				do {
					System.out.print("\n--------------------------------------------------------");
					if (!checkProduct(estoque, produto) && !(produto == ""))
						System.out.print("\\nAten��o!! \nO produto '" + produto + "' n�o existe no estoque.\n");
					if (!checkLetters(novoProduto))
						System.out.print("\nAten��o!! \nN�o poder� armazenar n�meros.\n");

					System.out.println("\nDigite o nome do produto para atualizar:");
					produto = ler.next();
					System.out.println("\nDigite o novo nome do produto:");
					novoProduto = ler.next();

				} while ( !(checkProduct(estoque, produto) && checkLetters(novoProduto))  );

				estoque.set(estoque.indexOf(produto), novoProduto);
				System.out.print("\n--------------------------------------------------------");
				break;
			case 4:
				System.out.print("\n--------------------------------------------------------\n\n");
				System.out.println(estoque);
				System.out.print("\n--------------------------------------------------------");
				break;
			}

		} while (opcao != 0);
	}
}