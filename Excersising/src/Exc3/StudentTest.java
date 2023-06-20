package Exc3;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student("Ahmed", 1234);               //you should know the deffernce between method and class
		System.out.println( s1.getCount());
		System.out.println( Student.getCount());
		
		Student s2 = new Student("Ahmed", 1234);
		Student.setCount(30);   //
		System.out.println( s2.getCount());
		System.out.println( Student.getCount());

	}

}
