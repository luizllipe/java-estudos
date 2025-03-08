package controle;

import java.time.Year;

public class Exercicio2 {
	public static void main(String[] args) {
		int ano = 2025;
		
		if(Year.isLeap(ano)) {
			System.out.printf("O ano é bissexto! " + ano);
			
		} else {
			System.out.println("O ano não é bissexto! ");
		}
	}
}
