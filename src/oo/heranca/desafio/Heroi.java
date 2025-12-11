package oo.heranca.desafio;

import oo.heranca.Jogador3;

public class Heroi extends Jogador {


	boolean atacar(Jogador3 oponente) {
		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);
		boolean ataque3 = super.atacar(oponente);
		return ataque1 || ataque2 || ataque3;
	}	
}
