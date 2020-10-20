package Lista03Exercicios;

public class Exe01 {
	public static void main(String args[]) {
		/*
		 * 1- Informar todos os números de 1000 a 1999 que quando divididos por 11
		 * obtemos resto = 5. (FOR)
		 */

		int count;

		for (count = 1000; count <= 1999; count++) {
			if (count % 11 == 5) {
				System.out.printf("\n %d", count);
			}
		}

	}
}
