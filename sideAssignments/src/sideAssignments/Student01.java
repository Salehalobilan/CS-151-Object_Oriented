package sideAssignments;

public class Student01 {
	
	private int level;
	private int grade;
	
	public void setLevel(int level) {
		level = this.level;
		
	}
	public int getLevel() {
		return level;
	}
	
    public void setGrade(int grade) {
    	if(grade >0 )
	        this.grade = grade;
	        else
	        System.out.println("Grade must be > 0");
	}
	public int getGrade() {
		return grade;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		

	}

}
