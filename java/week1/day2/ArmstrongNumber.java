package week1.day2;

public class ArmstrongNumber {
public static void main(String[] args) {
	{

        int num = 153;
        int originalNumber;
        int remainder;
        int calculated = 0;

        originalNumber = num;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            calculated += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(calculated == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
    }
}
}
