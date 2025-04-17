package classe;

public class Produto {

		String nome;
		double preco;
		static double desconto = 0.35;
		
		Produto() {
			
		}
		
		Produto(String nomeInicial, double precoInicial){
			nome = nomeInicial;
			preco = precoInicial;
		
		}
		
	
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
}
