package entities;

public class Bill {
	private char gender;
	private int beer;
	private int barbecue;
	private int softDrink;
	
	public char getGender() {
		return gender;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public int getBeer() {
		return beer;
	}
	
	public void setBeer(int beer) {
		this.beer = beer;
	}
	
	public int getBarbecue() {
		return barbecue;
	}
	
	public void setBarbecue(int barbecue) {
		this.barbecue = barbecue;
	}
	
	public int getSoftDrink() {
		return softDrink;
	}
	
	public void setSoftDrink(int softDrink) {
		this.softDrink = softDrink;
	}
	
	private double calcConsuption () {
		double consuption = (this.beer * 5.00) + (this.softDrink * 3.00) + (this.barbecue * 7.00) ;	
		return consuption;
	}
	
	public double cover() {
		
		return 0.0;
	}
	
	public double feeding() {
		return 0.0;
	}
	
	public double ticket() {
		return 0.0;
	}
	
	public double total() {
		return 0.0;
	}

	@Override
	public String toString() {
		return "Bill [gender=" + gender + ", beer=" + beer + ", barbecue=" + barbecue + ", softDrink=" + softDrink
				+ "]";
	}
	
	

}
