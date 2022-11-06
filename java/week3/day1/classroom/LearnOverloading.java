package week3.day1.classroom;

public class LearnOverloading {
	public int addNumbers(int a, int b) {
		System.out.println("LearnOverloading - Add Two int Numbers :" +(a+b));
		return b=a+b;

	}

	public int add(int a, int b, int c) {
		System.out.println("LearnOverloading - Add Three int Numbers : " +(a+b+c));
		return c;

	}

	public float add(float a, float b) {
		System.out.println("LearnOverloading - Add Two Float Numbers :" +(a+b));
		return b;

	}

	public float add(float a, int b) {
		System.out.println("LearnOverloading - One Float and One Integer Numbers :" +(a+b));
		return b;

	}
	public static void main(String[] args) {
		LearnOverloading overload = new LearnOverloading();
		overload.addNumbers(1, 2);
		overload.add(1, 2, 3);
		overload.add(0.1F, 0.2F);
		overload.add(0.5F, 5);
	}
}
