package Exc4;
import java.util.Scanner;

public class StudentTest {
	
	public static int fac(int n) {
		if (n==1||n==0)
			return 1;
		
		return n*fac(n-1);
		
	}
	public static int pow(int n,int po) {
		if (po==1)
			return n;
		return n*pow(n,po-1);
	}
	/*public static int fabonacci(int count) {
		if (count ==0)
		return 0;
				
	}*/


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number > 0: ");
		int n = input.nextInt();
		int fac = 1;
		System.out.printf("f = ");
		for (int i = n ; i > 0; i--) {
			System.out.printf("%d * %d \n", fac, i);
			fac *= 1;
		}
		System.out.println("F = " + fac);

		System.out.println(fac(3));
		System.out.println(pow(2,3));
	}

}
