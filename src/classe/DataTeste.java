package classe;

public class DataTeste {
	public static void main(String[] args) {
	
		System.out.println("Primeira Data:");
		var data1 = new Data();
		data1.dia = 01;
		data1.mes = "Abril";
		data1.ano= 2011;
		System.out.println(data1.dia);
		System.out.println(data1.mes);
		System.out.println(data1.ano);
		
		System.out.println("Segunda Data:");
		var data2 = new Data();
		data2.dia = 27;
		data2.mes = "Novembro";
		data2.ano = 2021; 
		
		System.out.println(data2.dia);
		System.out.println(data2.mes);
		System.out.println(data2.ano);
}
}
