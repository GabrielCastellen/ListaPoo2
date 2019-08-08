import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o primeiro número: ");
		float num1 = entrada.nextFloat();
		System.out.print("Informe o segundo número: ");
		float num2 = entrada.nextFloat();
		
		System.out.print("Informe a operação desejada(adição,subtração,multiplicação ou divisão): ");
		String operacao = entrada.next();
		
		float resultado = 0;
		boolean resultVal = true;
		
		if(operacao.equals("adição"))
			resultado = num1 + num2;
		else {
			if(operacao.equals("subtração"))
				resultado = num1 - num2;
			else {
				if(operacao.equals("multiplicação"))
					resultado = num1 * num2;
				else {
					if(operacao.equals("divisão"))
						resultado = num1 / num2;
					else {
						resultVal = false;
					}
				}
			}
		}
		if(resultVal) {
			System.out.println("Resultado: " + resultado);
			
			if(resultado % 2 == 0)
				System.out.print("O resultado é par, ");
			else
				System.out.print("O resultadao é ímpar, ");
			
			if(resultado > 0)
				System.out.print("positivo e ");
			else
				System.out.print("negativo e ");
			
			if(resultado != Math.round(resultado))
				System.out.println("decimal");
			else
				System.out.println("inteiro");
		}
		else
			System.out.println("Operação inválida");
		
		entrada.close();
		
	}

}
