package oo.heranca;

public class Jogo2 {

	public static void main(String[] args) {
		
		Heroi jg1 = new Heroi();
		jg1.x = 10;
		jg1.y = 10;
		
		
		Jogador2 jg2 = new Jogador2();
		jg2.x = 10;
		jg2.y = 11;
		
		
		
		
		System.out.println(jg1.vida);
		System.out.println(jg1.vida);
		
		jg1.atacar(jg2);	
		jg2.atacar(jg1);
		
		System.out.println(jg1.vida);
		System.out.println(jg2.vida);
	}
}

