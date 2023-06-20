package Tet9;

public class Util {
	
	public static <P extends Pair> boolean compare(P p1, P p2) {
		if (p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue()))
          return true;
        return false;
	}
	
	public static <K,V> boolean compare(K pair1Key, V pair1Value, K pair2Key, V pair2Value){
        if(pair1Key.equals(pair2Key) && pair1Value.equals(pair2Value))
        return true; 
        return false;
	}
	
	public static <T extends Comparable<T>> int countGreaterThan(T[] arr,T e) {
		int count = 0;
		for(T item: arr) {
			System.out.println(e);
			if(item.compareTo(e)>0)
				count++;}
		return count;
	}
	

	public static void main(String[] args) {
		OrderedPaid <String, Integer> pair1 = new OrderedPaid</*String,Integer <مولازم*/>("nawaf" , 22);
		OrderedPaid <String, Integer> pair2 = new OrderedPaid<String,Integer>("nawaf" , 22);

		OrderedPaid <Integer, Integer> pair3 = new OrderedPaid<Integer,Integer>(4432222 , 22);
		OrderedPaid <Integer, Integer> pair4 = new OrderedPaid<Integer,Integer>(10 , 22);
		
		System.out.println(compare(pair1,pair3));
		System.out.println(compare(pair1.getKey(),pair3.getValue(), pair2.getKey(),pair3.getValue()));
		
		
		
		Integer[] ints   = {1, 8, 5, 6, 7, 0};
		Double[] doubles = {1.1, 8.8, 5.5, 6.6, 7.7, 0.0};
		String[] strings = {"apple", "kiwi", "Mango", "orange", "banana"};
		System.out.println(countGreaterThan(ints,5));
		System.out.println(countGreaterThan(doubles,5.0));
		System.out.println(countGreaterThan(strings,"grappes"));

	}

}
