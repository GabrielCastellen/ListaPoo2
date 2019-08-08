import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a primeira nota: ");
		float nota1 = entrada.nextFloat();
		System.out.print("Informe a segunda nota: ");
		float nota2 = entrada.nextFloat();
		
		float media = (nota1 + nota2)/2;
		if(media >= 7)
			System.out.println("Aprovado");
		else
			System.out.println("Reprovado");
		
		entrada.close();
		
	}

}
