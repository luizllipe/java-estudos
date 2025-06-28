package arrays;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantas notas: ");
		
		int quantidadeDeNotas = entrada.nextInt();
		
		double[] notas = new double[quantidadeDeNotas];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite a nota " + (i + 1) + ": ");
			notas[i] = entrada.nextDouble();
		}

		double total = 0;
		for(double nota: notas) {
			total += nota;
		}
		
		double media = total  / notas.length;
		System.out.println("A média é " + media + "!");
		entrada.close();
	}
}