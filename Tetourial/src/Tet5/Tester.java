package Tet5;

public class Tester {

	public static void main(String[] args) {
		Point p1 = new Point(1,2);
		Point p2 = new Point(5,3);
		//from the Tutorial 3
		
		Circle c1 = new Circle(3,p1);
		Circle c2 = new Circle(2,p2);
		Cylinder cy1 = new Cylinder(3,p1,5);
		

//		_________________________________________________________________________________________
		Line l1 = new Line(p1,p2);
		
		System.out.println(p1);
		
		System.out.println("The disatnace from p1 to the point (5,3) is: " +  p1.distance(5,3));
		System.out.println("The disatnace between p1 and p2 is:          " +  p1.distance(p2));
		System.out.println("The disatnace from the start to p1 is:       " +  p1.distance());
		
		System.out.println(l1);
		System.out.println("Line length: " + l1.getStart().distance(l1.getEnd()));
		System.out.println("Line length: " + p1.distance(p2));   //it's the same thing
		//System.out.println("Line length: " + l1.start.distance(l1.end)); //same but it 
		                                                                 //has to be public
//__________________________________________________________________________________________
		
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println(c1.getArea());
		
		System.out.println(c2.getCircumference());
		
		System.out.println("Distance between 2 circles: " + c1.distance(c2));
		System.out.println("The disatnace from p1 to the point (5,3) is: " +  p1.distance(5,3));
		//we took the print above from the previous tutorial you can see it in the second print note down there
		//beacause they are the same thing
		
		System.out.println(cy1);
		
		
		String msg;
		msg = "google";
		System.out.println(msg);
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
