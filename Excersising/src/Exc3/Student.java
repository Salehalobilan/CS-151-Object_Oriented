package Exc3;

public class Student {
	private String name;
	private final int id;
	private static int count = 0;
	
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
		count++;
		
		
	}
	public Student() {
		this("no name", 0000);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getCount() {
		getid(1234);
		return count;
	}

	public static void setCount(int count) {
		setid(1234);
		Student.count = count;
	}

	public int getId() {
		return id;
	}

}
