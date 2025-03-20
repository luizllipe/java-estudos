package controle;
/**
8. Crie um programa que recebe 10 valores e ao final imprima o 
maior número.
*/
import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		int contador = 0;
		int numeroMaior = 0;
		while (contador < 10) {
			System.out.println("Digite um número: ");
			int num = entrada.nextInt();
			//if (num > numeroMaior) {
				
			numeroMaior = Math.max(numeroMaior, num);
			
			contador ++;
			}  
			
		 	
		System.out.println("Esse é o número maior: " + numeroMaior);
		
		entrada.close();
		}
		
	}

