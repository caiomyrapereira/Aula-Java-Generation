package PooLista02Exercicios;

public class TestVendedor {
	public static void main(String args[]) {
		
		Vendedor v1 = new Vendedor("Gabi","Rua bebi","(11)921213131",22,"3213232323", 700, 2000, 35);
		
		// Informa��o do v1
		v1.imprimirInfo();
		System.out.println("\n");
		
		// Validar cpf
		v1.validarCpf();
		v1.setCpf("30191910282");
		v1.validarCpf();
		
		// Calcular o sal�rio
		System.out.println("\n");
		v1.calcularSalario();
	}
}
