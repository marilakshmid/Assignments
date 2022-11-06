package week1.day2;

public class TwoWheeler {
	int noOfWheels=4;
	short noOfMirrors=2;
	long chassisNumber=7777;
	boolean isPunctured=false;
	String bikeName="JUPITER";
	double runningKM=1000.25;


	public static void main(String[] args) {
		TwoWheeler vehicle = new TwoWheeler();
		System.out.println(vehicle.bikeName);
		System.out.println(vehicle.chassisNumber);
		System.out.println(vehicle.isPunctured);
		System.out.println(vehicle.noOfWheels);
		System.out.println(vehicle.noOfMirrors);
		System.out.println(vehicle.runningKM);
	}
}
