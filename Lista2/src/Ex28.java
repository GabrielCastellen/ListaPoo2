import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Responda as perguntas abaixo(sim ou não)" );
		
		int contResp = 0;
		String resposta;
		boolean parar = false;
		
		System.out.print("Telefonou para a vítima? ");
		resposta = entrada.next();
		if(resposta.equals("sim")) {
			contResp++;
		}
		else {
			if(!resposta.equals("não"))
				parar = true;
		}
		
		if(!parar) {
			System.out.print("Esteve no local do crime? ");
			resposta = entrada.next();
			if(resposta.equals("sim")) {
				contResp++;
			}
			else {
				if(!resposta.equals("não"))
					parar = true;
			}
			
			if(!parar) {
				System.out.print("Mora perto da vítima? ");
				resposta = entrada.next();
				if(resposta.equals("sim")) {
					contResp++;
				}
				else {
					if(!resposta.equals("não"))
						parar = true;
				}
				
				if(!parar) {
					System.out.print("Devia para a vítima? ");
					resposta = entrada.next();
					if(resposta.equals("sim")) {
						contResp++;
					}
					else {
						if(!resposta.equals("não"))
							parar = true;
					}
					
					if(!parar) {
						System.out.print("Já trabalhou com a vítima? ");
						resposta = entrada.next();
						if(resposta.equals("sim")) {
							contResp++;
						}
						else {
							if(!resposta.equals("não"))
								parar = true;
						}
					}
				}
			}
		}
		if(!parar) {
			if(contResp == 2)
				System.out.println("Classificação: Suspeito");
			else {
				if(contResp == 3 || contResp == 4)
					System.out.println("Classificação: Cúmplice");
				else {
					if(contResp == 5)
						System.out.println("Classificação: Assassino");
					else
						System.out.println("Classificação: Inocente");
				}
			}
		}
		else
			System.out.println("Resposta inválida, a resposta deve ser sim ou não, e foi digitado " + resposta);
		
		entrada.close();
		
	}

}
