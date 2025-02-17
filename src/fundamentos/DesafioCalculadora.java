package fundamentos;
import java.util.Scanner;
public class DesafioCalculadora {     
public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    
    System.out.println("=================================================");
    System.out.println("================= CALCULADORA ===================");
    System.out.println("===================================================\n");

    System.out.print("Digite um numero: ");
    double num1 = entrada.nextDouble();

    System.out.print("Digite um operador [+ - * / %]: ");
    String operador = entrada.next();

    System.out.print("Digite outro numero: ");
    double num2 = entrada.nextDouble();

    var resultado =	
    	operador.equals("+") ? num1 + num2 :
		operador.equals("-") ? num1 - num2 :
		operador.equals("*") ? num1 * num2 :
		operador.equals("/") ? num2 != 0 ? num1 / num2 : 0 :
		operador.equals("%") ? num2 != 0 ? num1 % num2 : 0 :
		"Operação invalida, tente novamente!"; // Se o operador for inválido.
    
    System.out.println("O resultado da operação é: " + resultado);

    entrada.close();
}

}
