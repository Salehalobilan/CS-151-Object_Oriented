package Lab04;
public class MeasureCalculator{
	protected double[] numbers;
	
	public MeasureCalculator(int length){
		this.numbers = new double[length];
	}

	protected double getSum(){
		double sum = .0;
		for(double e : this.numbers)
			sum += e;
		return sum;
	}

	public double[] getNumbers(){
		return this.numbers;
	}
}
