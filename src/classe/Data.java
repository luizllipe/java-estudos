package classe;

public class Data {
	int mes;
	int dia;
	int ano; 

	Data(){
		dia = 1;
		mes = 1;
		ano = 1970;
	}
	
	Data(int dia, int meInicial, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String obterDataFormatada() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
	           
	void imprimirDataFormatada(){
		System.out.println(obterDataFormatada());
	}
}

