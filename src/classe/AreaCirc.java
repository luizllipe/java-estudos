package classe;

public class AreaCirc {
	public static void main(String[] args) {
	
}
	double raio;
	final static double PI = 3.1415;
	
	AreaCirc(double raioInicial) {
		raio = raioInicial;
				
	}
	
	double  area() {
		return PI * Math.pow(raio, 2);
	
	
	}	
	static double area(double raio) {
		return PI * Math.pow(raio, 2);
	}
}
