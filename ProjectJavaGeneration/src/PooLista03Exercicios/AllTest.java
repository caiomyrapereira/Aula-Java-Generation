package PooLista03Exercicios;

public class AllTest {
	public static void main(String args[]) {
		
		System.out.println("------Cachorro------");
		Cachorro dog  = new Cachorro("mike",10);
		System.out.println("Imitido som: "+dog.imitirSom());
		System.out.println("Ação: "+dog.faz());
		
		System.out.println("\n------Cavalo------");
		Cavalo cav  = new Cavalo("dan",12);
		System.out.println("Imitido som: "+cav.imitirSom());
		System.out.println("Ação: "+cav.faz());
		
		System.out.println("\n------Bixo preguiça------");
		Preguica bixo  = new Preguica("bixo",20);
		System.out.println("Imitido som: "+bixo.imitirSom());
		System.out.println("Ação: "+bixo.faz());
		
	}
}
