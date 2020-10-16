package PooLista03Exercicios;

public class Cachorro extends Animal {
	
	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}
	
	public String imitirSom() {
		return super.imitirSom("Au au..");
	}
	
	public String faz() {
		return super.faz("Deve Correr.");
	}
}
