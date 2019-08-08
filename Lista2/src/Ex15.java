import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o preço do produto: ");
		float preco = entrada.nextFloat();
		System.out.print("Informe o código de origem: ");
		int cod = entrada.nextInt();
		
		System.out.println("Preço: R$:" + preco);
		if(cod == 1)
			System.out.println("Procedência: Sul" );
		else {
			if(cod == 2)
				System.out.println("Procedência: Norte" );
			else {
				if(cod == 3)
					System.out.println("Procedência: Leste" );
				else {
					if(cod == 4)
						System.out.println("Procedência: Oeste" );
					else {
						if(cod == 5 || cod == 6)
							System.out.println("Procedência: Nordeste" );
						else {
							if(cod == 7 || cod == 8)
								System.out.println("Procedência: Centro-Oeste" );
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
