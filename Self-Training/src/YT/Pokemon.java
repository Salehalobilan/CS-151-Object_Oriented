package YT;

public class Pokemon {   //this is class                        
	String name; 
	int level=10;            //this is instance variable
	
	public void attack() {    //this is method
		System.out.println(name + " attack him!");
		
	}
	public Pokemon() {
		level = 1;
	}
	public Pokemon(String pName, int pLevel) {
		 name = pName;
		 level = pLevel;
	}
	
	 
	
	
	
	
	
	public static void main(String[] args) { //main just for testing instead of another class
		 
		//to create an object:
	    //classname var = new classname();
		Pokemon p1 =new Pokemon("Saleh",22);
		System.out.println(p1.level);
		p1.attack();
		
//		p1.name = "Pikachu";
//		//p1.level = 10;
//		
//		System.out.println(p1.name + " " + p1.level);
//		
//		Pokemon p2 = new Pokemon();
//		
//		p2.name  = "Eevee";
//		p2.level = 20;
//		p2.attack();
//		
//		System.out.println(p1.level);
		
		
	}
 
}



/* the goals :
           *Classes and methods
           *objects
           *toString() method
           *constructer ~ no args
           *Static
           *recursive (Optional)    
           *

*/