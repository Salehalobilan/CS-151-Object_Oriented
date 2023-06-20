package Tet5;

public class Rectiangle extends TwoDimensionalShape {
	
	protected double length, width;
	public Rectiangle(double length,double width, String color, Point position) {
		super(color, position);
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return length;
	}





	public void setLength(double length) {
		this.length = length;
	}





	public double getWidth() {
		return width;
	}





	public void setWidth(double width) {
		this.width = width;
	}
	
	@Override
	public String toString() {
		return "Rectiangle [length=" + length + ", width=" + width + "]";
	}
	public double getArea() {
		return length * width;
	}
	
	public double getPerimeter() {
		return 2 *  (length + width);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
