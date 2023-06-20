package Lab04;
import java.util.Arrays;

public class StandardDeviationCalculatorTest
{
	public static void main(String[] args) 
	{
		double[] array = {1.2,8.2,0.3,2.7,9.0};
		StandardDeviationCalculator sd = new StandardDeviationCalculator(array);
		System.out.println("Elements: "+ Arrays.toString(sd.getNumbers()));
		System.out.println("SD: " + sd.getStandardDeviation());
	}
}
