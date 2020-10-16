/*
 
 
1. Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos seletores
 (getters) e modificadores (setters), e ainda o construtor padr�o e pelo menos mais duas
 op��es de construtores conforme sua percep��o. Atributos: String nome; String endere�o;
 String telefone;
 
 */
package PooLista02Exercicios;

public class Pessoa {
	private String nome;
	private int idade;
	private String endereco;
	private String telefone;
	private String cpf;

	public Pessoa(String nome, String endereco, String telefone,int idade,String cpf){
		this.setNome(nome);
		this.setEndereco(endereco);
		this.setTelefone(telefone);
		this.setIdade(idade);
		this.setCpf(cpf);
	}
	
	public void imprimirInfo()
	{
		System.out.println(
				"\nNome do empregado: "+getNome()
				+"\n"+"CPF: "+getCpf()+"\n"+"Idade: "+getIdade()+"\n"+"Telefone: "+getTelefone()
				+"\n"+"Endere�o: "+getEndereco()
		);
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void addIdade() {
		 this.idade++;
	}
	
	public void validarCpf() {
		if(this.getCpf().length() == 11) 
			System.out.println("Cpf v�lido!");
		else
			System.out.println("Cpf inv�lido!");
	}
}
