package controle;

import java.util.Scanner;

public class Exercicio05 {

    static void perfeitoOuNao(int num) {
        int soma = 0;

        
        for (int i = 1; i < num; i++) {
            if (num % i == 0) { 
                soma += i;
            }
        }

    
        if (soma == num) {
            System.out.printf("%d é um número perfeito\n", num);
        } else {
            System.out.printf("%d não é um número perfeito\n", num);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int num = scanner.nextInt();

        perfeitoOuNao(num); 

        scanner.close();
    }
}
