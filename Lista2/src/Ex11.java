import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Em que turno você estuda?(M,V ou N): ");
		char turno = entrada.next().charAt(0);
		if(turno == 'M')
			System.out.println("Bom dia!");
		else {
			if(turno == 'V')
				System.out.println("Boa tarde!");
			else {
				if(turno == 'N')
					System.out.println("Boa Noite!");
				else
					System.out.println("Turno não existe");
			}
		}
		
		entrada.close();

	}

}
