import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o primeiro n�mero: ");
		float num1 = entrada.nextFloat();
		System.out.print("Informe o segundo n�mero: ");
		float num2 = entrada.nextFloat();
		
		System.out.print("Informe a opera��o desejada(adi��o,subtra��o,multiplica��o ou divis�o): ");
		String operacao = entrada.next();
		
		float resultado = 0;
		boolean resultVal = true;
		
		if(operacao.equals("adi��o"))
			resultado = num1 + num2;
		else {
			if(operacao.equals("subtra��o"))
				resultado = num1 - num2;
			else {
				if(operacao.equals("multiplica��o"))
					resultado = num1 * num2;
				else {
					if(operacao.equals("divis�o"))
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
				System.out.print("O resultado � par, ");
			else
				System.out.print("O resultadao � �mpar, ");
			
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
			System.out.println("Opera��o inv�lida");
		
		entrada.close();
		
	}

}
