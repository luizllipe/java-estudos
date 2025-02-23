package controle;
import java.util.*;

public class DesafioDaSemana {
	public static void main(String[] args) {
	
		 Scanner entrada = new Scanner(System.in);
		 
		 System.out.println("Informe o dia da semana: ");
		 String semana = entrada.nextLine().replace("á","a");
		 
		 
		 if(semana.equalsIgnoreCase("Domingo")){
			 System.out.println("1");
		 } else if(semana.equalsIgnoreCase("Segunda")) {
			 System.out.println("2");
		 }else if(semana.equalsIgnoreCase("Terça")) {
			 System.out.println("3");			 
		 } else if(semana.equalsIgnoreCase("Quarta")) {
			 System.out.println("4");
		 } else if (semana.equalsIgnoreCase("Quinta")) {
			 System.out.println("5");
		 } else if(semana.equalsIgnoreCase("Sexta")) {
			 System.out.println("6");
		 } else if(semana.equalsIgnoreCase("Sábado")) {
			 System.out.println("7");
		 }
		 
		 entrada.close();
	}
}
