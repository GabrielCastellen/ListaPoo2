import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a primeira nota: ");
		float nota1 = entrada.nextFloat();
		System.out.print("Informe a segunda nota: ");
		float nota2 = entrada.nextFloat();
		System.out.print("Informe a terceira nota: ");
		float nota3 = entrada.nextFloat();
		
		float media = ((nota1 + nota2 + nota3) / 3);
		
		if(media < 7) {
			System.out.println("Reprovado");
			System.out.println("Media: " + media);
		}
		else {
			if(media >= 10)
				System.out.println("Aprovado com Distinção");
			else
				System.out.println("Aprovado");
				System.out.println("Media: " + media);
		}
		
		entrada.close();
		
	}

}
