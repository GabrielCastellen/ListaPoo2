import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o valor do saque: ");
		int saque = entrada.nextInt();
		
		if(saque >= 10 && saque <= 600) {
			int notas100 = saque/100;
			saque = saque % 100;
			int notas50 = saque/50;
			saque = saque % 50;
			int notas10 = saque/10;
			saque = saque % 10;
			int notas5 = saque/5;
			int notas1 = saque % 5;
			System.out.println("Notas de 1: " + notas1);
			System.out.println("Notas de 5: " + notas5);
			System.out.println("Notas de 10: " + notas10);
			System.out.println("Notas de 50: " + notas50);
			System.out.println("Notas de 100: " + notas100);
		}
		else {
			System.out.println("Valor inválido");
		}
		
		entrada.close();
		
	}

}
