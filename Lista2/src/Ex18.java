import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o primeiro lado: ");
		float lado1 = entrada.nextFloat();
		System.out.print("Informe o segundo lado: ");
		float lado2 = entrada.nextFloat();
		System.out.print("Informe o terceiro lado: ");
		float lado3 = entrada.nextFloat();
		
		if((lado1 + lado2) > lado3 && (lado1 + lado3) > lado2 && (lado2 + lado3) > lado1) {
			if(lado1 == lado2 && lado1 == lado3) {
				System.out.println("O triângulo é equilátero");
			}
			else {
				if(lado1 != lado2 && lado1 != lado3 && lado2!= lado3)
					System.out.println("O triângulo é escaleno");
				else
					System.out.println("O triângulo é isóceles");
			}
		}
		else
			System.out.println("Os valores não formam um triângulo");
		
		entrada.close();
		
	}

}
