package oo.heranca.desafio.teste;

public class CarroTeste2 {

	
	public static void main(String[] args) {
		
		Carro2 c1 = new Gol2();
		
		c1.acelerar();
		System.out.println(c1);
		
		c1.acelerar();
		System.out.println(c1);
		
		c1.acelerar();
		System.out.println(c1);
		
		Carro2 c2 = new Ferrari2(400);
		
		c2.acelerar();
		c2.frear();
		System.out.println(c2);
		
		c2.acelerar();
		c2.frear();
		System.out.println(c2);
		
		c2.acelerar();
		System.out.println(c2);
}
}