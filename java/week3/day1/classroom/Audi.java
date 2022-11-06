package week3.day1.classroom;

public class Audi extends Car {
	public void hybridFuel()
	{
		System.out.println("Audi -> Fuel is having Hybrid Technology");
	}
	public void applyBrake() {
		super.applyBrake();
		System.out.println("Vehicle ->ABS Break Applied");
	}
	
}
