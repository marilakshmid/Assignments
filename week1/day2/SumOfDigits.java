package week1.day2;

public class SumOfDigits {

	public static void main(String[] args) {
		int num = 12345; 
		int digit = 0; 
		int sum=0;
		while(num!=0)
		{
			digit = num%10;
			sum = sum + digit;
			num = num/10;
			System.out.println("The remainder is : "+num); 
			System.out.println("The quotient is : "+digit);
		}
		System.out.println("The sum of digits: "+sum);  

	}
}
