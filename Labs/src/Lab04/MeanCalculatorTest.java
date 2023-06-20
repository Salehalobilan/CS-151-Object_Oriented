package Lab04;
import java.util.Arrays;

public class MeanCalculatorTest{
	public static void main(String[] args) {
		double[] array = {1.2,8.2,0.3,2.7,9.0};
		MeanCalculator mc = new MeanCalculator(array);
		System.out.println("Numbers: "+ Arrays.toString(mc.getNumbers()));
		System.out.println("Mean: " + mc.computeMean());
	}
}
