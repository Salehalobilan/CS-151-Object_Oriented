package Tet9;

public class OrderedPaid <k,v> implements Pair{
	private k key;
	private v value;
	public OrderedPaid(k key, v value) {
		this.key = key;
		this.value = value;
	}
	
	@Override
	public k getKey() {
		return key;
	}
	@Override
	public v getValue() {
		return value;
	}
	
	
	
	
}
