import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a primeira nota: ");
		float nota1 = entrada.nextFloat();
		System.out.print("Informe a segunda nota: ");
		float nota2 = entrada.nextFloat();
		
		float media = (nota1 + nota2)/2;
		
		if(media > 0 && media <= 3)
			System.out.println("Reprovado");
		else {
			if(media >= 3 && media< 7) {
				System.out.println("Em exame");
			}
			else {
				if(media >= 7 && media<= 10) {
					System.out.println("Aprovado");
				}
				else {
					System.out.println("Notas inválidas.");
				}
			}
		}
		
		System.out.println("Média: "+media);
		
		entrada.close();
		
	}

}