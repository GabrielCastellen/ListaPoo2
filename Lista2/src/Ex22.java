import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número menor que 1000: ");
		int num = entrada.nextInt();
		
		if(num>=1000 || num <0) {
			System.out.println("Número inválido");
		}
		else {
			int cent = num/100;
			num = num%100;
			int dez = num/10;
			num = num%10;
			int uni = num;
			
			if(cent > 0) {
				if(cent == 1)
					System.out.print(cent + " centena");
				else
					System.out.print(cent + " centenas");
				
				if(dez > 0 && uni > 0)
					System.out.print(", ");
				else {
					if((dez > 0 && uni == 0) || (dez == 0 && uni > 0))
						System.out.print(" e ");
				}
			}
			if(dez == 1)
				System.out.print(dez + " dezena");
			else {
				if(dez > 1)
					System.out.print(dez + " dezenas");
			}
			if(uni > 0) {
				if(dez >0) {
					System.out.print(" e ");
				}
				if(uni == 1)
					System.out.println(uni + " unidade");
				else
					System.out.println(uni + " unidades");
			}
			
			entrada.close();
			
		}

	}

}
