package week3.day1.classroom;

public class MyVehicle {
	public static void main(String[] args) {

		//Overloading applyBrake Method
		//Audi au = new Audi();
		
		
		
		// Vehicle class
		Vehicle v = new Vehicle();
		v.applyBrake();
		v.soundHorn();
		System.out.println("--------Vehicle------------");
		// Car Class
		Car c = new Car();
		c.applyBrake();
		c.soundHorn();
		c.openSunRoof();
		c.turnOnAC();
		System.out.println("--------Car------------");
		// Audi Class
		Audi a = new Audi();
		a.applyBrake();
		a.soundHorn();
		a.turnOnAC();
		a.openSunRoof();
		a.hybridFuel();
		a.applyBrake();
		//System.out.println("--------Audi------------");
		// BMW Class
		BmwCar b = new BmwCar();
		b.autoPark();
		b.applyBrake();
		b.soundHorn();
		b.openSunRoof();
		b.turnOnAC();
		System.out.println("--------BmwCar------------");
		// Auto Class
		Auto au = new Auto();
		au.applyBrake();
		au.soundHorn();
		au.handStarter();
		System.out.println("--------Auto------------");
		// Bajaj Class
		Bajaj ba = new Bajaj();
		ba.applyBrake();
		ba.soundHorn();
		ba.handStarter();
		ba.electricMeter();
		System.out.println("--------Bajaj------------");

	}
}
