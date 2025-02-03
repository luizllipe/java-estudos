package fundamentos;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		
			// parte de cima
		double a = Math.pow(6 * (3 + 2 ), 2);
		double b = 3 * 2;
		
		 // parte de baixo
		double c = (1 - 5) * (2 - 7);
		double d = 2;
		
		 // resultado de cima
		double e = a/b;
		double f = Math.pow(c / d, 2);
		
		 //resultado de baixo
		double abc = Math.pow(e - f,3);
		double ca = Math.pow(10, 3);
		
		//resultado
		double resultado = abc / ca;
		
		System.out.println("O resultado é: " + resultado);
}
}