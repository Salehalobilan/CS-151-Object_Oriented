package Tet5;

public class Line {
	private Point start,end;
	
	public Line(Point start, Point end) {
		this.start = start;
		this.end = end;
		
	}
	public void setStart(Point start, Point end) { 
		this.start = start;
		this.end = end;
	}
	public Point getStart() {
		return this.start;
	}
	public void setEnd(Point end) {
		this.end = end;
	}
	public Point getEnd() {
		return this.end;
		
	}
	public String toString() {
		return "Line[Start = " + this.start + " End = " + this.end + "]";
	}

	
	
	
}
