package week1.day1;

import week1.day2.CarMethods;

public class MyCar {
	public static void main(String[] args) {
		CarMethods obj = new CarMethods();
		System.out.println("sum is: "+obj.addThreeNumbers(12, 2, 14));
		System.out.println(obj.carCondition());
		System.out.println(obj.getMyCarColor());
		System.out.println(obj.divideTwoNumbers(4, 2));
		System.out.println(obj.getRegNumber());
		System.out.println(obj.multiplyTwoNumbers(1.2, 2.4));
		obj.printCarName();
		System.out.println(obj.subTwoNumbers(4, 2));
		
	}
}
