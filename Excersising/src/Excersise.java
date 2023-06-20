import javax.sound.midi.SysexMessage;

public class Excersise {

	
	
	public static int psum(int x, int y) {    //1
		
		return x+y;
	}
	
	public static void p(int a,double b) {           //1
		//return  <---- You can't use return here because you made the method void so there is no return but you can use print
		System.out.println(a * b);
	}
	
	public static void testchange(int[] x) {                    //2
	x[0] = 20;
	}
	
	
	public static void testprimitive() {                     //3
		
	}
	
	
	public static void main(String[] args) {
		 p(5,4);             //1
		 
		 int[] x= {10};
		 System.out.println(x[0]);
		 testchange(x);                                 //2
		 System.out.println(x);
		 
		 
		// int []x= 10;
		 System.out.println("x from main method" + x);
		 testchange(x);                                            //3
		 System.out.println();


	}

}
