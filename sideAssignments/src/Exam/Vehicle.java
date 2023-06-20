package Exam;

public class Vehicle {
	private String make;
	private int PurchaseDate;
	private double price;
	
	public Vehicle(String make, int PurchaseDate, double price) {
		this.make = make;
		this.PurchaseDate = PurchaseDate;
		if (price > 0 )
		this.price = price;
		else this.price = 0.0;
	}
	
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getPurchaseDate() {
		return PurchaseDate;
	}

	public void setPurchaseDate(int purchaseDate) {
		PurchaseDate = purchaseDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price > 0 )
			this.price = price;
			else this.price = 0.0;
	}

	public String Display() {
		 return getMake() + "\n" + getPurchaseDate() + "\n" + getPrice();
	}
	public double getActualPrice() {
		if (price > 0 )
			return price;
		else 
			return 0.0;
	}
	public double getActualPrice(int currentyear) {
		double discount = (currentyear-PurchaseDate)*0.01;
		return Math.max(0.0, (1.0-discount)*price);
		
	}

	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", PurchaseDate=" + PurchaseDate + ", price=" + price + ", getActualPrice()="
				+ getActualPrice() + "]";
	}
	

}


