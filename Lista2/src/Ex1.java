import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o primeiro n�mero: ");
		int num1 = entrada.nextInt();
		System.out.print("Informe o segundo n�mero: ");
		int num2 = entrada.nextInt();
		
		if(num1 > num2) {
			System.out.println("O maior n�mero � " + num1);
		}
		else {
			if(num1 < num2)
				System.out.println("O maior n�mero � " + num2);
			else
				System.out.println("Os n�meros s�o iguais!");
		}
		
		entrada.close();

	}

}
