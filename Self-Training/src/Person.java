
public class Person {
	int hi=5 ;

	public Person(int hayat) {
		 hi = hayat;
	}
	
	
	public static void main(String[] args) {
		Person p1 = new Person(25);
		//p1.Person(p1.hi);
	}
	public double pow(int n, int po) {
		if (po == 1) 
			return n;
	
	return n*pow(n,po-1);
	}
	public int fac(int n) {
	if(n==1||n==0) 
		return 1;
		return n*fac(n-1);
	
	}
	
	

}
