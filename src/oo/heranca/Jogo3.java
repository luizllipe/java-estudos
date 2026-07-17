package oo.heranca;

public class Jogo3 {

	public static void main(String[] args) {
		
		Monstro3 monstro = new Monstro3();
		monstro.x = 10;
		monstro.y = 10;
		
		Heroi3 heroi = new Heroi3();
		heroi.x = 10;
		heroi.y = 11;
		
		System.out.println("Monstro tem => " + monstro.vida);
		System.out.println("Heroi tem => " + heroi.vida);
		
		monstro.atacar(heroi);
		monstro.atacar(monstro);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.andar(Direcao3.NORTE);
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		System.out.println("Monstro tem => " + monstro.vida);
		System.out.println("Heroi tem => " + heroi.vida);
		
	}
}
