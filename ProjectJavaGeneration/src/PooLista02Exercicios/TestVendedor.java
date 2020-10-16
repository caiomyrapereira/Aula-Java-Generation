package PooLista02Exercicios;

public class TestVendedor {
	public static void main(String args[]) {
		
		Vendedor v1 = new Vendedor("Gabi","Rua bebi","(11)921213131",22,"3213232323", 700, 2000, 35);
		
		// Informação do v1
		v1.imprimirInfo();
		System.out.println("\n");
		
		// Validar cpf
		v1.validarCpf();
		v1.setCpf("30191910282");
		v1.validarCpf();
		
		// Calcular o salário
		System.out.println("\n");
		v1.calcularSalario();
	}
}
