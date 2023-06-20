package YT;

public class pokemonTest {

	public static void main(String[] args) {
		Pokemon p1 =new Pokemon();
		p1.name = "Pikachu";
		p1.level = 10;
		
		System.out.println(p1.name + " " + p1.level);
		
        Pokemon p2 = new Pokemon();
		
		p2.name  = "Eevee";
		p2.level = 20;
		p2.attack();
		

	}

}
