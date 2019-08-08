import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o valor da sua hora de trabalho: ");
		float v_hora = entrada.nextFloat();
		System.out.print("Informe quantas horas trabalhou no mês: ");
		int horas = entrada.nextInt();
		
		float salarioB = v_hora*horas;
		System.out.println("Salário Bruto: (" + (int)v_hora + " * " + horas + ")     :R$ " + salarioB);
		
		float IR_percent = 20;
		
		if(salarioB <= 900) {
			IR_percent = 0;
		}
		else {
			if(salarioB <= 1500) {
				IR_percent = 5;
			}
			else {
				if(salarioB <= 2500) {
					IR_percent = 10;
				}
			}
		}
		
		float IR_Desconto = salarioB * (IR_percent/100);
		System.out.println("(-)IR(" + (int)IR_percent + "%)               :R$" + IR_Desconto);
		float INSS_Desconto = salarioB * (float)0.10;
		System.out.println("(-)INSS(10%)            :R$" + INSS_Desconto);
		float FGTS = salarioB * (float)0.11;
		System.out.println("FGTS(11%)             :R$" + FGTS);
		System.out.println("Total de descontos          :R$" + (IR_Desconto + INSS_Desconto));
		float salarioL = salarioB - IR_Desconto - INSS_Desconto;
		System.out.println("Salário Líquido         :R$" + salarioL);
	
		entrada.close();
		
	}

}
