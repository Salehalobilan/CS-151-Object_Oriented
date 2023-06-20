package Tet3;

public class Tester {

	public static void main(String[] args) {
		Point p1 = new Point(1,1);
		Point p2 = new Point(5,3);
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

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
