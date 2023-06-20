package Exam;

import java.util.Arrays;

public class ManageVehicles {

	public static void main(String[] args) {
		Vehicle car = new Car("Toyota",2014, 10000, 6, 100000);
		Vehicle car2 = new Car("Ferrari", 2019, 20000, 6, 50000);
		Vehicle airplane = new Airplane("Boeing", 2009, 80000, 110000);
		
		Vehicle[] vehicles = {car,car2,airplane};
		//System.out.println(airplane.Display());
		//System.out.println(car2.getActualPrice());
		
		System.out.println("the price of your " + car.getMake() + " = " + car.getActualPrice(2014));
		System.out.println("the price of your " + car.getMake() + " = " + car2.getActualPrice(2023));
		System.out.println("the price of your " + airplane.getMake() + " = " + airplane.getActualPrice(2023));
		
		System.out.println(car);
		System.out.println(car2);
		System.out.println(airplane);
	}

}
