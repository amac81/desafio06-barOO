package application;

import entities.Bill;

public class Program {

	public static void main(String[] args) {
		
		Bill b1 = new Bill();
		
		b1.setBeer(3);
		b1.setBarbecue(1);
		b1.setGender('F');
		b1.setSoftDrink(2);
		
		
		
		System.out.println(b1);

	}

}
