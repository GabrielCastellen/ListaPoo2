import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um valor: ");
		int valor = entrada.nextInt();
		
		if(valor > 0)
			System.out.println("O valor é positivo.");
		else {
			if(valor < 0)
				System.out.println("O valor é negativo.");
			else
				System.out.println("O valor é zero.");
		}
		
		entrada.close();

	}

}
