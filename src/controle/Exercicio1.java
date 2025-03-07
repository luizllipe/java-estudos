package controle;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio1 {
	public static void main(String[] args) {
		String valor = JOptionPane.showInputDialog("Digite um número: ");
		int numero = Integer.parseInt(valor);
		
		if(numero % 2 == 0) {
			System.out.println("Número par!");
		} else {
			System.out.println("Número ímpar!");
		}
		 
		 
		 
		 
		
 }
}


