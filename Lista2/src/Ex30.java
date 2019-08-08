import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a quantidade(em Kg) de morangos: ");
		float pesoMorangos = entrada.nextFloat();
		System.out.print("Informe a quantidade(em Kg) de maçãs: ");
		float pesoMacas = entrada.nextFloat();
		
		float preco;
		if(pesoMorangos <= 5)
			preco = pesoMorangos * (float)2.5;
		else
			preco = pesoMorangos * (float)2.2;
		
		if(pesoMacas <= 5)
			preco = preco + (pesoMacas * (float)1.8);
		else
			preco = preco + (pesoMacas * (float)1.5);
		
		if((pesoMorangos + pesoMacas) > 8 || preco > 25)
			preco = preco * (float)0.90;
		
		System.out.println("Valor a ser pago: R$:" + preco);
		
		entrada.close();
		
	}

}
