package Lab06;

public abstract class SalableBook extends Book{
	private double price;
	 
	private String category;
	 
	public SalableBook(String title, Author author, String ISBN, double price, String category) {
	 
	super(title, author, ISBN);
	 
	this.price = price;

	this.category = category;
	}
	
	public double getPrice() {
	
	return price;
	}
	public void setPrice(double price) {
	
	this.price = price;
	}
	public String getCategory() {
	
	return category;
	}
	public void getCategory(String category) {
	
	this.category = category;
	}
	public abstract boolean isAvailable();
	
	public abstract double computeCost();
	@Override     
	public String toString() {
	
	return String.format("SalableBook[%s, price=%f, category=%s]", 
	super.toString(), getPrice(), getCategory());
	}

}
