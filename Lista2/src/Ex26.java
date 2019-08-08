import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		float num = entrada.nextFloat();
		
		if(num != Math.round(num))
			System.out.println("O número é decimal");
		else
			System.out.println("O número é inteiro");
		
		entrada.close();
		
	}

}
