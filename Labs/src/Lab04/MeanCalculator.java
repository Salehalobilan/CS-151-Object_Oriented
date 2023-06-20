package Lab04;
public class MeanCalculator extends MeasureCalculator{
	public MeanCalculator(double[] numbers){
		super(numbers.length);
		for(int i = 0; i < numbers.length; i++)
			this.numbers[i] = numbers[i];
	}

	public double computeMean() {
		return (getSum() / this.numbers.length);
	}
}
