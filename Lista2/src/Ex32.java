import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		char[] gabarito = {'a','a','b','b','c','c','d','d','e','e'};
		
		char[] resposta = new char[10];
		
		int pontuacaoFinal = 10;
		
		System.out.println("Informe as suas respostas abaixo");
		
		for(int k = 0 ; k <= 9 ; k++) {
			System.out.print(k+1 + "ª resposta: ");
			resposta[k] = entrada.next().charAt(0);
		}
		
		for(int k = 0 ; k <= 9 ; k++) {
			System.out.print("Q" + (k+1) + " : " + resposta[k] + " :");
			if(resposta[k] != gabarito[k]) {
				System.out.print(" (" + gabarito[k] + ")");
				pontuacaoFinal--;
			}
			System.out.println();
		}
		
		System.out.println("Pontuação Final : " + pontuacaoFinal);
		
		entrada.close();

	}

}
