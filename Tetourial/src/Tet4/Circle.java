package Tet4;

public class Circle {
	private double raduis;
	private Point center;
	
	public Circle(double raduis, Point center) {
		this.raduis = raduis;
		this.center = center;
	}
	public void setRaduis(double raduis) {
		this.raduis = raduis;
	}
	public double getRaduis() {
		return this.raduis;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	public Point getCenter() {
		return this.center;
	}
	public String toString() {
		return "Circle[center = " + center + " , raduis= " + raduis + " ]";
	}
	/*
	public void setCenterX(int x) {
		this.center.setX(x);
	}
	public Point getCenterX() {
		return this.center.getX();
	}
	public void setCenterY(int x) {
		this.center.setX(x);
	}
	public Point getCenterY() {
		return this.center.getX();
	}
	public void setCenterXY(int x,int y) {
		this.center.setX(x);
		this.center.setY(y);
	}
	public Point getCenterXY()[] {
		return this.center.getXY();
	} 
	*/
	
	public double getArea() {
		//(𝜋 ∗ 𝑟𝑎𝑑𝑖𝑢𝑠2)
		return Math.PI * Math.pow(raduis,2);
		
	}
	public double getCircumference() {
		//(2 ∗ 𝜋 ∗ 𝑟𝑎𝑑𝑖𝑢𝑠)
		return 2 * Math.PI * raduis;
	}
	
	public double distance(Circle another) {
		return this.center.distance(another.center);
	}
	
	

}
