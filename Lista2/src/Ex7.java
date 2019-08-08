import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float troca;
		System.out.print("Informe o primeiro número: ");
		float num1 = entrada.nextFloat();
		System.out.print("Informe o segundo número: ");
		float num2 = entrada.nextFloat();
		System.out.print("Informe o terceiro número: ");
		float num3 = entrada.nextFloat();
		
		if(num1 < num2) {
			troca = num1;
			num1 = num2;
			num2 = troca;
		}
		if(num2 < num3) {
			troca = num2;
			num2 = num3;
			num3 = troca;
			if(num1 < num2) {
				troca = num1;
				num1 = num2;
				num2 = troca;
			}
		}
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		entrada.close();
		
	}

}
