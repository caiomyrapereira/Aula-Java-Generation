package PooLIsta01Exercicios;

public class Cliente {
	private String nome;
	private int cpf;
	private String enderenco;
	private int idade;
	
	public Cliente(String nome, int idade, String enderenco, int cpf) {
		this.nome = nome;
		this.idade = idade;
		this.enderenco = enderenco;
		this.cpf = cpf;
	}
	
	public  String getNome(  ) {
	    return this.nome;
	}
	
	public void Renomear(String newNome) {
		this.nome = newNome;
	}
	
	public void addIdade() {
		this.idade++;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public String getInderenco() {
		return this.enderenco;
	}
	
	public void mudarEndereco(String newEnderenco) {
		this.enderenco = newEnderenco;
	}
}
