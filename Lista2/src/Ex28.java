import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Responda as perguntas abaixo(sim ou n�o)" );
		
		int contResp = 0;
		String resposta;
		boolean parar = false;
		
		System.out.print("Telefonou para a v�tima? ");
		resposta = entrada.next();
		if(resposta.equals("sim")) {
			contResp++;
		}
		else {
			if(!resposta.equals("n�o"))
				parar = true;
		}
		
		if(!parar) {
			System.out.print("Esteve no local do crime? ");
			resposta = entrada.next();
			if(resposta.equals("sim")) {
				contResp++;
			}
			else {
				if(!resposta.equals("n�o"))
					parar = true;
			}
			
			if(!parar) {
				System.out.print("Mora perto da v�tima? ");
				resposta = entrada.next();
				if(resposta.equals("sim")) {
					contResp++;
				}
				else {
					if(!resposta.equals("n�o"))
						parar = true;
				}
				
				if(!parar) {
					System.out.print("Devia para a v�tima? ");
					resposta = entrada.next();
					if(resposta.equals("sim")) {
						contResp++;
					}
					else {
						if(!resposta.equals("n�o"))
							parar = true;
					}
					
					if(!parar) {
						System.out.print("J� trabalhou com a v�tima? ");
						resposta = entrada.next();
						if(resposta.equals("sim")) {
							contResp++;
						}
						else {
							if(!resposta.equals("n�o"))
								parar = true;
						}
					}
				}
			}
		}
		if(!parar) {
			if(contResp == 2)
				System.out.println("Classifica��o: Suspeito");
			else {
				if(contResp == 3 || contResp == 4)
					System.out.println("Classifica��o: C�mplice");
				else {
					if(contResp == 5)
						System.out.println("Classifica��o: Assassino");
					else
						System.out.println("Classifica��o: Inocente");
				}
			}
		}
		else
			System.out.println("Resposta inv�lida, a resposta deve ser sim ou n�o, e foi digitado " + resposta);
		
		entrada.close();
		
	}

}
