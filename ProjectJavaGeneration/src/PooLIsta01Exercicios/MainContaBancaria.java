package PooLIsta01Exercicios;

public class MainContaBancaria {
	public static void main(String args[]) {
		ContaBancaria conta = new ContaBancaria(123, "abc123", 2000);

		// M�todo consultaSaldo
		System.out.println("-------Consulta saldo ------");
		conta.consultaSaldo("asa");
		conta.consultaSaldo("abc123");
		System.out.println("----------------------------");

		// M�todo dep�sito
		System.out.println("---------Dep�sito-----------");
		conta.deposito("asa", 2000);
		conta.consultaSaldo("abc123");
		conta.deposito("abc123", 2000);
		conta.consultaSaldo("abc123");
		System.out.println("----------------------------");

		// M�todo saque
		System.out.println("-----------Saque------------");
		conta.saque("asa", 4000);
		conta.consultaSaldo("abc123");
		conta.saque("abc123", 4000);
		conta.consultaSaldo("abc123");
		conta.saque("abc123", 1);
		System.out.println("----------------------------");
	}
}
