package Tet3;

public class Point {
	 private int x, y;
	 //private String w;            just for testing
	 
	 public Point() {
		 this.x = 0;
		 this.y = 0;
		 //this.w = null;            
		 
	 }
	 public Point(int x,int y) {
		 this.x = x;
		 this.y = y;
		 
	 }
	 public void setX(int x) {
		 this.x = x;
		 
	 }
	 public int getX() {
		 return this.x;
	 }
	 public void setY(int y) {
		 this.y = y;
	 }
	 public int getY() {
		 return this.y;
	 }
	 public String toString() {
		 return "(" + this.x + "," + this.y + ")";
	 }
	 //here we done the basic things
	 // now we gonna put the array method ("2 Elements getXY"):
	 
 	 public int getXY() [] {     /* here we use array because we can't return 2 integers
 		                      so we put them in an array to return them both with one method*/
     //public int[] getXY() {
		 int resaults [] = new int[2];
		 resaults[0] = this.x;
		 resaults[1] = this.y;
		 return resaults;
	 }
 	public void setXY(int x,int y) { // here we did not use an array because
		 this.x = x;                 // we don't need 2 returns anyway it's void
		 this.y = y;
 	} 
 	
 	//now he asked for 3 overloaded distance method
 	// return the distance from this instance to the given point (x,y)
 	public double distance(int x, int y) { 
 		int xDiff = this.x - x;
 		int yDiff = this.y - y;
 		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
 				}
 	// return the distance from this instance to the given point instance (called another)
 	public double distance(Point another) { 
 		int xDiff = this.x - another.x;
 		int yDiff = this.y - another.y;
 		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
 				}
 	//return the distance from the instance (0,0)
 	public double distance() { 
 		return Math.sqrt(this.x*this.x + this.y*this.y);
 				}
	 
	 

	 
	 
	 
	 
}
