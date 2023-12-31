/**
* Programa que pede o input dos seguintes dados:
* 
* >Genero de um utilizador (cliente do bar);
* >Quantidade de cervejas; 
* >Quantidade de refrigerantes;
* >Quantidade de espetinhos;
* 
* No final apresenta um relatório ao utilizador relativo ao seu consumo no bar.  
*
* @author  Arnaldo Canelas
* @version 1.0
* @since   2023-12-02 
*/

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bill;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		//Objeto Scanner para entrada de dados, a partir de System.in 
		Scanner sc = new Scanner(System.in);
		
		Bill b1 = new Bill();
		
		int itemQuantity = 0;
		
		
		char gender = askAndValidateGenderInput(sc);
		
		b1.setGender(gender);
		
		itemQuantity = askAndValidateIntInput("Quantidade de cervejas: ", sc);
		b1.setBeer(itemQuantity);
		
		itemQuantity = askAndValidateIntInput("Quantidade de refrigerantes: ", sc);
		b1.setSoftDrink(itemQuantity);
		
		itemQuantity = askAndValidateIntInput("Quantidade de espetinhos: ", sc);
		b1.setBarbecue(itemQuantity);
		
		// gerar Relatório
		b1.report();	
		
		sc.close();
	}
	
	/**
	 * pede ao utilizador um caracter, valida-o e retorna-o
	 * 
	 * @param scanner - objeto Scanner para entrada de dados, a partir de System.in 
	 * @return caracter 'F' ou o caracter 'M'
	 */
	public static char askAndValidateGenderInput(Scanner scanner) {
		char gender = 0;
		
		System.out.print("Sexo: ");
		
		do {
			gender = scanner.next().charAt(0);
		
			if(gender != 'F' && gender != 'M') {
				System.out.print("Valor invalido! Favor digitar F ou M: ");
			}	
		} while(gender != 'F' && gender != 'M');
		
		return gender;
	}
	
	/**
	 * pede ao utilizador um número, valida-o e retorna-o
	 * 
	 * @param askMessage - String com o texto a apresentar ao utilizador
	 * @param scanner - objeto Scanner para entrada de dados, a partir de System.in 
	 * @return número inteiro
	 */
	public static int askAndValidateIntInput(String askMessage, Scanner scanner) {
		int value = 0;
		boolean askAgain = true;
		
		System.out.print(askMessage);
		while(askAgain) 
		{
			if (scanner.hasNextInt()) 
			{
				value = scanner.nextInt();
				if(value < 0) {
					System.out.println("Introduza um número >= 0.");
					askAgain = true;
				}
				else {
					askAgain = false;
					break;
				}
			} 
			else {
				System.out.println("Número inválido! Introduza novamente.");
				scanner.next();
				askAgain = true;
			}
		}
		
		return value;
	}

}
