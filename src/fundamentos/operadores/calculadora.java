package fundamentos.operadores;
 import java.util.*;
public class calculadora {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        
		        while (true) {
		            // Exibe o menu de operações
		            System.out.println("Escolha a operação:");
		            System.out.println("1. Adição");
		            System.out.println("2. Subtração");
		            System.out.println("3. Multiplicação");
		            System.out.println("4. Divisão");
		            System.out.println("5. Sair");
		            
		            // Lê a opção do usuário
		            int escolha = scanner.nextInt();
		            
		            if (escolha == 5) {
		                System.out.println("Calculadora encerrada.");
		                break;
		            }

		            // Lê os dois números
		            System.out.print("Digite o primeiro número: ");
		            double num1 = scanner.nextDouble();
		            System.out.print("Digite o segundo número: ");
		            double num2 = scanner.nextDouble();
		            
		            // Realiza a operação selecionada
		            switch (escolha) {
		                case 1:
		                    System.out.println("Resultado: " + (num1 + num2));
		                    break;
		                case 2:
		                    System.out.println("Resultado: " + (num1 - num2));
		                    break;
		                case 3:
		                    System.out.println("Resultado: " + (num1 * num2));
		                    break;
		                case 4:
		                    if (num2 != 0) {
		                        System.out.println("Resultado: " + (num1 / num2));
		                    } else {
		                        System.out.println("Erro! Divisão por zero.");
		                    }
		                    break;
		                default:
		                    System.out.println("Opção inválida. Tente novamente.");
		                    break;
		            }

		            // Pergunta se o usuário quer fazer outro cálculo
		            System.out.print("Deseja fazer outro cálculo? (s/n): ");
		            char continuar = scanner.next().charAt(0);
		            if (continuar != 's' && continuar != 'S') {
		                System.out.println("Calculadora encerrada.");
		                break;
		            }
		        }
		        
		        scanner.close();
		    }
		

		
	}

