package Tet5;

public class TwoDimensionalShape extends Shape {
	
	
	
	public TwoDimensionalShape(String color, Point position) {
		super(color, position);
		
	}

	@Override
	public String toString() {
		return "TwoDimensionalShape []";
	}
	
	public double getPerimeter() {
		System.out.println("[TwoDimensionalShape] Perimeter is Unknown!");
		return 0.0;
	}
	public double getArea() {
		System.out.println("[TwoDimensionalShape] Area is Unknown!");
		return 0.0;
	}










	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
