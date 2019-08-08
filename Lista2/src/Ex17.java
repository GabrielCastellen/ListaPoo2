import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a primeira nota: ");
		float nota1 = entrada.nextFloat();
		System.out.print("Informe a segunda nota: ");
		float nota2 = entrada.nextFloat();
		
		if(nota1 >= 0 && nota1 <= 10 && nota2 >= 0 && nota2 <= 10) {
			float media = (nota1 + nota2)/2;
			String conceito;
			if(media >=0 && media < 4)
				conceito = "E";
			else {
				if(media >=4 && media < 6)
				conceito = "D";
				else {
					if(media >=6 && media < 7.5)
						conceito = "C";
					else {
						if(media >=7.5 && media < 9)
							conceito = "B";
						else {
							if(media >=9 && media <= 10)
							conceito = "A";
							else {
							conceito = "erro";
							}
						}
					}
				}
			}
			
			System.out.println("Notas: " + nota1 + "  " + nota2);
			System.out.println("Média: " + media);
			System.out.println("Conceito: " + conceito);
			
			if(conceito == "A" || conceito == "B" || conceito == "C")
			System.out.println("Aprovado");
			else {
				if(conceito == "D" || conceito == "E")
				System.out.println("Reprovado");
			}
		}
		else {
			System.out.println("Notas inválidas");
		}
		
		entrada.close();
		
	}

}