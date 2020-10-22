package exercicioLogicaProgramacao2;
import java.util.Scanner;

public class exercicioLogicaProgramacao2 {

	public static void main(String[] args) {
	float salario;
	float porcentagem;
	float reajuste;
		
	Scanner leitura = new Scanner(System.in);
	
	
	System.out.println("Digite o valor do salario:");
	salario = leitura.nextFloat();
	
	System.out.println("Digite o valor do reajuste:");
	porcentagem = leitura.nextFloat();
	
	reajuste = ((salario * porcentagem)/100) + salario;
	
	System.out.println("o valor do reajuste é:" + reajuste);	

	}

}
