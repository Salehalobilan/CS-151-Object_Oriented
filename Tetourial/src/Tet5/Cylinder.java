package Tet5;

public class Cylinder extends Circle{
	private double height;
	
	public Cylinder(double raduis ,Point center ,double height) {
		super(raduis,center);
		this.height = height;
	}
	
	public void setHieght(double height) {
		this.height = height;
	}
	public double getHieght() {
		return this.height = height;
	}

	@Override
	public String toString() {
		return "Cylinder[Circle= "+ super.toString() +"\n\t height= " + height 
				+ " ,Area= " + getArea()
				+ " ,Volume= "+ getVolume() + "]";
	}
	public double getArea() {
		//(𝒄 ∗ 𝒉 + 𝟐 ∗ 𝒃)
		return getCircumference() * height + 2 * super.getArea(); /*<--- here we put (super) becuase there is twio method called getArea*/
	}
	public double getVolume() {
		// (𝒃 ∗ 𝒉)
		return super.getArea() * height; /*<--- here we put (super.) becuase there is twio method called getArea*/
	}
	
	

}
