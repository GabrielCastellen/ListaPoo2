import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("informe o primeiro valor(ax�): ");
		int a = entrada.nextInt();
		
		if(a == 0) {
			System.out.println("A equa��o n�o � de segundo grau");
		}
		else {
			System.out.print("informe o segundo valor(bx): ");
			int b = entrada.nextInt();
			System.out.print("informe o terceiro valor(c): ");
			int c = entrada.nextInt();
			int delta = (b*b) -(4*a*c);
			if(delta < 0)
				System.out.println("A equa��o n�o possui raizes reais.");
			else {
				if(delta == 0)
					System.out.println("A raiz da equa��o � " + (-b/2*a));
				else {
					System.out.println("A primeira raiz � " + ((-b + Math.sqrt(delta))/(2*a)));
					System.out.println("A segunda raiz � " + ((-b - Math.sqrt(delta))/(2*a)));
				}
			}
		}
		
		entrada.close();
		
	}

}
