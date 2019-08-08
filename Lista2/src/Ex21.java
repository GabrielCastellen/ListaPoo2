import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a data (dd/mm/aaaa): ");
		String data = entrada.nextLine();
		
		if((data.indexOf("/") == 2) && (data.indexOf("/", 5) == 5)) {		
			String[] dataSep = data.split("/");
			int dia = Integer.parseInt(dataSep[0]);
			int mes = Integer.parseInt(dataSep[1]);
			int ano = Integer.parseInt(dataSep[2]);
			if(dia > 0 && dia <=31 && mes > 0 && mes <=12 && ano >=0)
				if((!(ano>=0 && ano % 4 == 0 && (ano%100 != 0 || ano%400 == 0)) && mes ==2 && dia > 28) || ((ano>=0 && ano % 4 == 0 && (ano%100 != 0 || ano%400 == 0)) && mes ==2 && dia > 29)) {
					System.out.println("Inválido, o ano não é bissexto ou o dia informado é maior que 29.");
				}
				else
					System.out.println("Data válida.");
			else {
				System.out.println("Data inválida, valores informados inválidos.");
			}
		}
		else {
			System.out.println("Data inválida, não está no formato dd/mm/aaaa.");
		}
		
		entrada.close();
		
	}

}
