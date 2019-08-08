import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe uma letra: ");
		String letra = entrada.next();
		
		if("a".equals(letra) || "e".equals(letra) || "i".equals(letra) || "o".equals(letra) || "u".equals(letra) || "A".equals(letra) || "E".equals(letra) || "I".equals(letra) || "O".equals(letra) || "U".equals(letra))
			System.out.println("A letra " + letra + " é uma vogal.");
		else
			System.out.println("A letra " + letra + " é uma consoante.");
		
		entrada.close();
		
	}

}