import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o pre�o do produto: ");
		float preco = entrada.nextFloat();
		System.out.print("Informe o c�digo de origem: ");
		int cod = entrada.nextInt();
		
		System.out.println("Pre�o: R$:" + preco);
		if(cod == 1)
			System.out.println("Proced�ncia: Sul" );
		else {
			if(cod == 2)
				System.out.println("Proced�ncia: Norte" );
			else {
				if(cod == 3)
					System.out.println("Proced�ncia: Leste" );
				else {
					if(cod == 4)
						System.out.println("Proced�ncia: Oeste" );
					else {
						if(cod == 5 || cod == 6)
							System.out.println("Proced�ncia: Nordeste" );
						else {
							if(cod == 7 || cod == 8)
								System.out.println("Proced�ncia: Centro-Oeste" );
							else {
								System.out.println("Produto Importado");
							}
						}
					}
				}
			}
		}
	
		entrada.close();
	
	}

}
