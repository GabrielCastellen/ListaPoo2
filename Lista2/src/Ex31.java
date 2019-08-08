import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o tipo da carne comprada: ");
		String TipoCarne = entrada.nextLine();
		System.out.print("Informe a quantidade(em Kg) de carne: ");
		float peso = entrada.nextFloat();
		System.out.print("Informe o tipo de pagamento: ");
		String Pagamento = entrada.nextLine();
		Pagamento = entrada.nextLine();
		
		boolean ErroTipo = false;
		float preco =0;
		if(TipoCarne.equals("Filé duplo")) {
			if(peso <= 5)
				preco = peso * (float)4.9;
			else
				preco = peso * (float)5.8;
		}
		else {
			if(TipoCarne.equals("Alcatra")) {
				if(peso <= 5)
					preco = peso * (float)5.9;
				else
					preco = peso * (float)6.8;
			}
			else {
				if(TipoCarne.equals("Picanha")) {
					if(peso <= 5)
						preco = peso * (float)6.9;
					else
						preco = peso * (float)7.8;
				}
				else
					ErroTipo = true;
			}
		}
		
		
		if(!ErroTipo) {
			if(peso >=0 ) {
				System.out.println("Cupom Fiscal - Hipermercado Tabajara");
				System.out.println("Tipo da carne: " + TipoCarne);
				System.out.println("Quantidade: " + peso + "Kg");
				System.out.println("Preço Total: R$:" + preco);
				System.out.println("Tipo de pagamento: " + Pagamento);
				float desconto=0;
				if(Pagamento.equals("Cartão Tabajara"))
					desconto = preco *(float)0.05;
				System.out.println("Valor do desconto: R$:" + desconto);
				System.out.println("Valor a pagar: R$:" + (preco - desconto));
			}
			else
				System.out.println("Peso inválido");
		}
		else
			System.out.println("Tipo inválido");
	
		entrada.close();
	
	}

}
