package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4550.89;
		p1.desconto = 0.45;
		
		var p2 = new Produto();
		p2.nome = "Teclado";
		p2.preco = 15.75;
		p2.desconto = 0.29 ;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.preco * (1 - p1.desconto);
		double precoFinal2 = p2.preco * (1 - p2.desconto);
		double mediaCarrinho = (precoFinal1 + precoFinal2 / 2);
	
		System.out.printf("Média do carrinho = R$%.2f." , mediaCarrinho);
	}
}
