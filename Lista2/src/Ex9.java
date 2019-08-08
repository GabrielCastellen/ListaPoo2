import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe a sua altura: ");
		float altura = entrada.nextFloat();
		System.out.print("Informe o seu peso: ");
		float peso = entrada.nextFloat();
		System.out.print("Informe o seu sexo(M ou F): ");
		String sexo = entrada.next();
		float Peso_Ideal = 0;
		if("M".equals(sexo)) {
			Peso_Ideal = ((float)72.7*altura) - 58;
			sexo = "Masculino";
		}
		else {
			if("F".equals(sexo)) {
				Peso_Ideal = ((float)62.1*altura) - (float)44.7;
				sexo = "Feminino";
			}
		}
		
		if(Peso_Ideal == 0)
			System.out.println("Sexo Inválido");
		else {
			System.out.println("Altura: " + altura);
			System.out.println("Peso: " + peso + "kg");
			System.out.println("Sexo: " + sexo);
			System.out.println("Peso ideal: " + Peso_Ideal);
			if(Peso_Ideal > peso)
				System.out.println("Você está abaixo do seu peso ideal.");
			else {
				if(Peso_Ideal < peso)
					System.out.println("Você está acima do seu peso ideal.");
				else
					System.out.println("Você está no seu peso ideal");
			}
				
		}
		
		entrada.close();
		
	}

}
