package PooLIsta01Exercicios;

public class ContaBancaria {
	private int id;
	private String senha;
	private double saldo;
	
	public ContaBancaria(int id, String senha, double dinheiro) {
		this.id  = id;
		this.senha = senha;
		this.saldo = dinheiro;
	}
	
	public void consultaSaldo(String senha) {
		if(this.senha == senha) 
			System.out.println("O seu saldo � "+ this.saldo + "Reais");
		else
			System.out.println("Senha inv�lida.");
	}
	
	public void deposito(String senha ,double dinheiro ) {
		if(this.senha == senha) {
			if(dinheiro>0) {
				this.saldo+= dinheiro;
				System.out.println("Sucesso!");
			}
			else {
				System.out.println("O dinheiro do deposito n�o podse negativo.");
			}
		}
		else {
			System.out.println("Senha inv�lida para deposito.");
		}
	}
	
	public void saque(String senha ,double dinheiro ) {
		if(this.senha == senha) {
			if(dinheiro>0 && dinheiro<=this.saldo) {
				this.saldo-= dinheiro;
				System.out.println("Sucesso!");
			}
			else {
				System.out.println("O dinheiro do saque n�o pode ser negativo"
						+ " e tamb�m n�o pode utrapassa o limite do saldo.");
			}
		}
		else {
			System.out.println("Senha inv�lida para saque.");
		}
	}
    
}
