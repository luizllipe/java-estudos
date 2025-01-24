package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
public static void main(String[] args) {
   
	double a = 1;  // impícita
	System.out.println(a); 
	
	float b = (float) 1.1234678888; // explícita (CAST)
	System.out.println(b);
	
	int c = 340;
	byte d = (byte) c;  // explícita (CAST)
	System.out.println(d);
	
	double e = 1.99999;
	int f = (int) e; //explícita (CAST)
	System.out.println(f);
}
}

