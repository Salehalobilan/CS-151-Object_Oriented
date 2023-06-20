package Tet5;

public class Shape {
	
	protected String color;
	protected Point position;
	public Shape(String color,Point position) {
		this.color = color;
		this.position = position;
	}
	public double getArea() {
		System.out.println("[shape] Area is unkown");
		return 0.0;
	}
	
	
	

	@Override
	public String toString() {
		return "Shape [color=" + color + ", position=" + position + "]";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		

	}

}
