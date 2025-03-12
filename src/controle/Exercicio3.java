package controle;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite a nota do aluno: ");
		double nota = entrada.nextDouble();
		
		
		if(nota >= 7) {
			System.out.println("Aprovado!");
		} else if(nota >= 5) {
			System.out.println("Recuperação!");
		}else {
			System.out.println("Reprovado!");
		}
		
	
	entrada.close();	

			
}
}