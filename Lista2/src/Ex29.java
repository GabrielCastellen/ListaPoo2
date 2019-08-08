import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o número de litros vendidos: ");
		float litros = entrada.nextFloat();
		
		boolean valinv = false;
		
		if(litros < 0) {
			valinv = true;
		}
		float preco = 0;
		
		if(!valinv) {
			System.out.println("Informe o tipo do combustível(A-álcool, G-gasolina): ");
			String tipo = entrada.next();
			
			if(tipo.equals("A")) {
				if(litros <= 20)
					preco = ((float)1.90 * litros) *(float)0.97;
				else
					preco = ((float)1.90 * litros) *(float)0.95;
			}
			else {
				if(tipo.equals("G") && litros > 0) {
					if(litros <= 20)
						preco = ((float)2.50 * litros) *(float)0.96;
					else
						preco = ((float)2.50 * litros) *(float)0.94;
				}
				else {
					valinv = true;
				}
			}
			
			if(!valinv)
				System.out.println("Valor a ser pago: " + preco);
			else
				System.out.println("Tipo inválido");
		}
		else {
			System.out.println("O valor não pode ser negativo");
		}
	
		entrada.close();
		
	}

}
