import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o número: ");
		int num = entrada.nextInt();
		
		if(num%2 == 0)
			System.out.println("o número ímpar é " + (num+1));
		else
			System.out.println("o número par  é " + (num-1));
		
		entrada.close();
		
	}

}
