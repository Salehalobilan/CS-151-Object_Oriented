package Exc8_Exception;



public class exep {
	
	public static void main(String[] args) throws AgelessException {
		validateAge(-1);

	}

	private static void validateAge(int age) throws AgelessException  {
		
			throw new AgelessException("Oh Nooooo somthing went wrong!");
		
	}

	
}
