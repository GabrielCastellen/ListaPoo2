import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float maior;
		float menor;
		
		System.out.print("Insira o primeiro número: ");
		float num1 = entrada.nextFloat();
		System.out.print("Insira o segundo número: ");
		float num2 = entrada.nextFloat();
		System.out.print("Insira o terceiro número: ");
		float num3 = entrada.nextFloat();
		
		if(num1 > num2 && num1 > num3) {
			maior = num1;
			if(num2 > num3)
				menor = num3;
			else
				menor = num2;
		}
		else {
			if(num2 >= num1 && num2 >= num3) {
				maior = num2;
				if(num1 > num3)
					menor = num3;
				else
					menor = num1;
			}
			else {
				maior = num3;
				if(num1 > num2)
					menor = num2;
				else
					menor = num1;
			}
		}
		
		System.out.println("Menor: " + menor);
		System.out.println("Maior: " + maior);
		
		entrada.close();
	}

}
