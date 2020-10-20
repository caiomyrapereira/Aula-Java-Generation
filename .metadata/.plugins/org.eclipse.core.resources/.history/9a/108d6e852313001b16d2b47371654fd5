package Desafios;


public class MenorEMaior {
	
	static int rand(int i, int j) {
		
		return (int) Math.ceil(Math.random() * (i  - j + 1)) - 1 + j;
	}
	
	public static void main(String args[]) {
		
		double n = Math.pow(10, 8);
		int value = (int)n;
		int[] arr = new int[10];
		int line, column,temporaria, somaMenor = 0, somaMaior = 0;
		
		//entrada de valores
		for(line=0;line<10;line++) {
			arr[line] = rand(-value, value);
		}
		
		// deixar de forma crescente 
		for(line=2;line<=8;line++) {
			for(column=2;column<=8;column++) {
				if(arr[column] > arr[column+1]) {
					temporaria = arr[column+1];
					arr[column+1] = arr[column];
					arr[column] = temporaria;
				}
			}
		}
		
		// soma 
		for(line=2;line<=7;line++) {
			somaMenor+=arr[line];
		}
		
		for(line=3;line<=8;line++) {
			somaMaior+=arr[line];
		}
		
	    System.out.printf("a soma de menos é %d", somaMenor);		
	    System.out.printf("a soma de menos é %d", somaMaior);	
		
	}
}
