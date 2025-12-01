package oo.heranca;

public class Heroi2  extends Jogador3{
	
		boolean atacar(Jogador3 oponente) {
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		
		if(deltaX == 0 && deltaY == 1) {
			oponente.vida -= 10;
			return true;
		} else if(deltaX == 1 && deltaY == 0) {
			return true;
		} else {
			return false;
		}
	
	}
}
