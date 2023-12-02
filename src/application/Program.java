/**
* Programa que ...
* 
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
		
		
		b1.setBarbecue(1);
		
		char gender = askAndValidateGenderInput(sc);
		
		b1.setGender(gender);
		
		int nBeers = askAndValidateIntInput("Quantidade de cervejas: ", sc);
		b1.setBeer(nBeers);
		
		b1.setSoftDrink(2);
				
		System.out.println(b1);
		
		
		
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
				if(value < 1) {
					System.out.println("Introduza um número >= 1.");
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
