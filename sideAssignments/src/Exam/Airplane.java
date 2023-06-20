package Exam;

public class Airplane extends Vehicle {
	private int flighthours;

	public Airplane(String make, int PurchaseDate, double price, int flighthours) {
		super(make, PurchaseDate, price);
		this.flighthours = flighthours;
	}

	public int getFlighthours() {
		return flighthours;
	}

	public void setFlighthours(int flighthours) {
		this.flighthours = flighthours;
	}
@Override
	public String Display() {
		 return getMake() + "\n" + getPurchaseDate() + "\n" + getPrice() + "\n" + getFlighthours();
	}
@Override
    public double getActualPrice(int currentyear) {
	double discount = 0.1 * flighthours/1000.0;
	return getPrice()-discount;
}

@Override
public String toString() {
	return "Airplane [flighthours : " + flighthours + " Hours" + ", Make : " + getMake() + ", PurchaseDate : "
			+ getPurchaseDate() + ", Price : " + getPrice() + ", Actual Price : " + getActualPrice() + "]";
}

   
}
    
 
 