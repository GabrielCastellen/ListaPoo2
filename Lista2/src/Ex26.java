import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um n�mero: ");
		float num = entrada.nextFloat();
		
		if(num != Math.round(num))
			System.out.println("O n�mero � decimal");
		else
			System.out.println("O n�mero � inteiro");
		
		entrada.close();
		
	}

}
