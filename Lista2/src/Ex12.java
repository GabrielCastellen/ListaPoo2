import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o salário a ser reajustado: ");
		float SalarioAnt = entrada.nextFloat();
		
		float percentual;
		
		if(SalarioAnt <= 280)
			percentual = 20;
		else {
			if(SalarioAnt > 280 && SalarioAnt <= 700)
				percentual = 15;
			else {
				if(SalarioAnt > 700 && SalarioAnt <= 1500)
					percentual = 10;
				else
					percentual = 5;
			}
		}
		float aumento = SalarioAnt * (percentual / 100);
		float SalarioNovo = SalarioAnt + aumento;
		
		System.out.println("Salário antes do reajuste: R$:" + SalarioAnt);
		System.out.println("Percentual de reajuste: " + percentual + "%");
		System.out.println("Valor do aumento: R$:" + aumento);
		System.out.println("Salario após reajuste: R$:" + SalarioNovo);
		
		entrada.close();
	}

}