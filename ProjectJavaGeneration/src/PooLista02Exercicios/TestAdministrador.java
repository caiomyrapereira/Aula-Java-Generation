package PooLista02Exercicios;

public class TestAdministrador {
	public static void main(String args[]) {
		
		
		Administrador adm = new Administrador("Jo�o","Rua bebi","(11)921213131",22 , "3213232323", 2000);
		
		adm.imprimirInfo();
		
		// M�todo Ajudar
		adm.Ajudar(500);
		System.out.println("A ajuda De Custo:"+adm.getAjudaDeCusto());
	}
}
