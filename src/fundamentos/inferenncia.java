 package fundamentos;

public class inferenncia {
 public static void main(String[] args) {
	
		// Bloco 1 esquerda
		int a = 6 * (3+2);
		int ab = (int) Math.pow(a , 2);
		int abc = ab / 6;
		
		// Bloco 2 direita
		int b = (1 - 5)* (2 - 7) / 2;
		int ba = (int)Math.pow(b , 2);
		
		int c = abc - ba;
		int ca = (int) Math.pow(c , 3); // Resultado parte de cima
		
		// Parte de baixo
		int d = 10;
		int da = (int) Math.pow(d ,3);
		
		System.out.println(ca / da); //Resultado
}
}

