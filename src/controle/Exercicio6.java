package controle;



import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Random random = new Random();

		System.out.println("Digite um número de 0 a 100: ");
		int numeroAleatorio = random.nextInt(101);
	
		 Scanner entrada = new Scanner(System.in);  
		 int tentativas = 1;
		 boolean tentativasDisponiveis = false;
		 
		 System.out.println("Tente adivinhar o número entre 0 e 100!");

		 while (tentativas < 11  && !tentativasDisponiveis) {
			 System.out.println("Tentativas: " + tentativasDisponiveis);
			 tentativas ++;
		 }
		 
		int adivinha = entrada.nextInt();
		if (adivinha == numeroAleatorio) {
			 System.out.println("Parabéns você acertou o número!");
			 tentativasDisponiveis = true;
		 } else if (adivinha < numeroAleatorio){
			 System.out.println("O número maior que " + adivinha);
		 }else {
			 System.out.println("O número menor que " + adivinha);
		 }
		
		 if (tentativas == 11 && ! tentativasDisponiveis) {
			 System.out.println("Você não conseguiu adivinhar. O número era " + numeroAleatorio);
		 
		 }
		 
		
		 
		 entrada.close();
		
	}
}
