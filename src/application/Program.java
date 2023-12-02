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
		
		b1.setBeer(3);
		b1.setBarbecue(1);
		
		char gender = askGenderInput(sc);
		
		b1.setGender(gender);
		
		
		
		b1.setSoftDrink(2);
				
		System.out.println(b1);
		
		
		
		sc.close();

	}
	
	/**
	 * processa o input e validação do input de um caracter representando o género (F ou M)
	 * 
	 * @param scanner - objeto Scanner para entrada de dados, a partir de System.in 
	 * @return caracter 'F' ou o caracter 'M'
	 */
	public static char askGenderInput(Scanner scanner) {
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

}
