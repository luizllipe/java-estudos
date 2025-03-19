package controle;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int soma = 0;

		while (true) {
			System.out.println("Digite um número: ");
			int num = entrada.nextInt();
			if (num < 0) {
				break;
			}

			soma += num;
			
			System.out.println("Essa foi a soma dos números " + soma);

			System.out.println("============================================================");
		}

		System.out.println("Finalizou o progama.................................");
		entrada.close();
	}
}