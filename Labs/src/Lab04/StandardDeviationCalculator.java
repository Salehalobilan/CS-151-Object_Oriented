package Lab04;
public class StandardDeviationCalculator extends MeasureCalculator
{
	public StandardDeviationCalculator(double[] numbers)
	{
		super(numbers.length);
		double mean = (new MeanCalculator(numbers)).computeMean();
		for(int i = 0; i < numbers.length; i++)
			this.numbers[i] = Math.pow(numbers[i] - mean, 2);
	}

	public double getStandardDeviation() 
	{
		return Math.sqrt(getSum() / this.numbers.length);
	}
}
