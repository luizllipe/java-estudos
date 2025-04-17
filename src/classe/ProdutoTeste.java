package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		
	Produto p1 = new Produto("Iphone", 3500);
	
	System.out.println("O valor final é: R$ " + p1.precoComDesconto());
	}
}
