package Lab06;

public class PaperBook extends SalableBook {
	private final double weight;

	private int quantity;
	
	public PaperBook(String title, Author author, String ISBN, double price, String category, double weight, int quantity) {	
	super(title, author, ISBN, price, category);
	 
	this.weight = weight;
	 
	this.quantity = quantity;
	}
	public double getWeight() {
	
	return weight;
	}
	public void setQuantity(int quantity) {
	
	this.quantity = quantity;
	}
	public int getQuantity() {
	
	return quantity;
	}
	@Override
	public boolean isAvailable() {
	
	return quantity > 0;
	}
	@Override    
	public double computeCost() {
	
	return getPrice() * getWeight();
	}
	@Override
	public String toString() {
	
	return String.format("PaperBook[%s, weight=%f, quantity=%d]",	super.toString(), getWeight(), getQuantity());
	}

}
