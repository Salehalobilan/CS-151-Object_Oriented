package Tet5;

public class Square extends Rectiangle{
	
	public Square(double length,double width, String color, Point position) {
		super(length ,width, color, position);
		
	}
	
	
	@Override
	public String toString() {
		return "Square []";
	}


	public double getArea() {
		return super.getArea()
;	}
	
//	public double getPerimeter() {
//		return super.getPerimeter();
//	}

	
	
	


}
