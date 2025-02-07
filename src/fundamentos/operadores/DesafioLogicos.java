package fundamentos.operadores;

public class DesafioLogicos {
	 public static void main(String[] args) {
		 // Trabalho na terça
		 // Trabalho na quinta
		 boolean trabalho1 = true;
		 boolean trabalho2 = false;
		 System.out.println("Os dois trabalhos deram certo? " + trabalho2);
		  
		 // televisao de 50 ou 32 polegadas		
		 boolean tv50 = trabalho1 && trabalho2;
		 boolean tv32 = trabalho1 ^ trabalho2;
		
		System.out.println("Comprou a televisão 50? " + tv50);
		System.out.println("Comprou a televisão 32? " + tv32);
		
		 // sorvete 
		 boolean sorvete = trabalho1  ||  trabalho2;
		 System.out.println("A familia tomou sorvete? " + sorvete);
		 System.out.println("Mais saudável? " + !sorvete);
	}
}
