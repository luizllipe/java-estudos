 package fundamentos;

public class Wrapper {
	
	
public static void main(String[] args) {
	//byte 
	Byte b = 100; 
	Short s = 1000; 
	  
	// Integer. parseInt(entrada.next())
	Integer i = 10000; 
	Long l = 1000000000L;
	 System.out.println(b.byteValue());
	System.out.println(s.toString());
	System.out.println(i * 3);
	Float f = 123.10F;
	System.out.println(f);
	Double d = 1234.5678; 
	System.out.println(d);
	 Boolean bo =  Boolean.parseBoolean("true");
	 System.out.println(bo);
	 System.out.println(bo.toString().toUpperCase());
	 
	 Character c = '#';
	 System.out.println(c + "...");
}
}
