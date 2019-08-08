import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o sexo(M - Masculino, F - Feminino): ");
		char letra = entrada.next().charAt(0);
		
		if(letra == 'M')
			System.out.println("M - Masculino");
		else {
			if(letra == 'F')
				System.out.println("F - Feminino,");
			else
				System.out.println("Sexo não identificado.");
		}
		
		entrada.close();

	}

}
