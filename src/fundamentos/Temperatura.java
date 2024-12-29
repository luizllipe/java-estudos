package fundamentos; 

public class Temperatura {
public static void main(String[] args) {
	// ( °F - 32) x 5/9 = °C
	  
	double F = 40;
	final double ajuste = 32;
	final double fator = 5/9.0;
	double C = (F - ajuste) * fator;
	
	   
	System.out.println(C);
	
}


}