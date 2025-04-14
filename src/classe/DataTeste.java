package classe;

public class DataTeste {
	public static void main(String[] args) {
	
		
		var data1 = new Data();
		
		var data2 = new Data(1, 4, 2011);
		

		String dataFormatada1 = data1.obterDataFormatada();
		
		System.out.println(dataFormatada1);
		System.out.println(data2.obterDataFormatada());
		
		data1.imprimirDataFormatada();
		data2.imprimirDataFormatada();
	}
}
