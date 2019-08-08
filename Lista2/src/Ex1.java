import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o primeiro número: ");
		int num1 = entrada.nextInt();
		System.out.print("Informe o segundo número: ");
		int num2 = entrada.nextInt();
		
		if(num1 > num2) {
			System.out.println("O maior número é " + num1);
		}
		else {
			if(num1 < num2)
				System.out.println("O maior número é " + num2);
			else
				System.out.println("Os números são iguais!");
		}
		
		entrada.close();

	}

}
