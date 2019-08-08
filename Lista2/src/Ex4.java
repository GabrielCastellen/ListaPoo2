import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um ano(4 dígitos): ");
		int ano = entrada.nextInt();
		
		if((ano % 4 == 0) && (ano % 100 != 0)) {
			System.out.println("O ano " + ano + " é bissexto");
		}
		else {
			if(ano % 400 == 0)
				System.out.println("O ano " + ano + " é bissexto");
			else
				System.out.println("O ano " + ano + " não é bissexto");
		}
		
		entrada.close();

	}

}
