package controle;

import java.util.Scanner;

public class Exercicio4 {
	


	    // Função que verifica se o número é primo
	    private static boolean ehPrimo(int numero) {
	        if (numero <= 1) {
	            return false; // 0 e 1 não são primos
	        }
	        for (int i = 2; i <= Math.sqrt(numero); i++) { // Verifica até a raiz quadrada do número
	            if (numero % i == 0) {
	                return false; // Se for divisível, não é primo
	            }
	        }
	        return true; // Se não for divisível, é primo
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite um número: ");
	        int numero = scanner.nextInt(); // Lê o número digitado pelo usuário

	        // Exibe os números primos até o número digitado
	        for (int i = 2; i <= numero; i++) {
	            if (ehPrimo(i)) {
	                System.out.println(i + " é primo.");
	            }
	        }

	        scanner.close(); // Fecha o scanner após o uso
	    }
	

}

