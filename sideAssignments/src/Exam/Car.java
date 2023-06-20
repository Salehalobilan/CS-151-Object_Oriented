package Exam;

public class Car extends Vehicle {
	private double engine;
	private double kilometers;
	public Car(String make, int PurchaseDate, double price, double engine, double kilometers) {
		super(make, PurchaseDate, price);
		this.engine = engine;
		this.kilometers = kilometers;
	}
	public double getEngine() {
		return engine;
	}
	public void setEngine(double engine) {
		this.engine = engine;
	}
	public double getKilometers() {
		return kilometers;
	}
	public void setKilometers(double kilometers) {
		this.kilometers = kilometers;
	}
	@Override
	public String Display() {
		 return getMake() + "\n" + getPurchaseDate() + "\n" + getPrice() + "\n" + getEngine() + getKilometers();
	}
	@Override
	public double getActualPrice(int currentyear) {
		double discount = (currentyear-getPurchaseDate()*0.02);
		discount += 0.05*(int)(kilometers/10000);
		if ((getMake() == "Toyota") || (getMake() == "Nissan")) {
			discount += 0.1; }
		if ((getMake() == "Ferrari") || (getMake() == "Porsche")) {
			discount -=0.2; }
		return getPrice() - discount;
	
	}
	@Override
	public String toString() {
		return "Car [engine=" + engine + ", kilometers : " + kilometers + "km" + ", Make : " + getMake()
				+ ", Purchase Date : " + getPurchaseDate() + ", Price : " + getPrice() + ", Actual Price : "
				+ getActualPrice(2023) + "]";
	}
	
	
}
