package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
System.out.println("Funcionário 1 Digite seu salário");
String salario = teclado.next();
		 System.out.println("Funcionário 2 Digite seu salário");
String salario2 = teclado.next();
		 System.out.println("Funcionário 3 Digite seu salário");
String salario3 = teclado.next();
		double  func1  = Double.parseDouble(salario);
		double  func2 = Double.parseDouble(salario2);
		double func3 = Double.parseDouble(salario3);
	
	    double soma = (func1 + func2 + func3);
	    System.out.println("A soma dos salários é " + soma);
	    double media = (soma / 3);
	    
	}
}
