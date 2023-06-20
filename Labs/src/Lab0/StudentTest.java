package Lab0;

public class StudentTest {

	public static void main(String[] args) {
		Student s  = new Student();
		
		s.name = "Saleh";
		s.age = 22;
		System.out.printf("Student name is %s and he/she is %d years old\n", s.name,s.age);
		System.out.println(s.toString());
		
		

	}

}
