package oo.heranca;

public class Jogador {

	public int x;
	public int y;

	public boolean andar(Direcao direcao) {
		switch(direcao) {
			case NORTE:
				y--;
				break;
			case LESTE:
				x++;
				break;
			case SUL:
				y++;
				break;
			case OESTE:
				x--;
				break;
	
		}
		
		return true;
	}
}
