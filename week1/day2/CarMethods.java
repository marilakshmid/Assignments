package week1.day2;

public class CarMethods {
	
public void printCarName()
{
	System.out.println("Mercedas");
	
}
public int getRegNumber()
{
	int RegNo=3333;
	return RegNo;
	}
public String getMyCarColor()
{
	String carcolor="Blue";
	return carcolor;
	}
public boolean carCondition()
{
	boolean carStatus=true;
	return carStatus;
	}
public int addThreeNumbers(int num1,int num2,int num3)
{
	int sum = num1+num2+num3;
	return sum;
	}
public int subTwoNumbers(int num1,int num2)
{
	int sub = num1-num2;
	return sub;
	}
public float multiplyTwoNumbers(double d,double e)
{
	float mul =  (float) (d*e);
	return mul;
	}
public int divideTwoNumbers(int num1,int num2)
{
	int div = num1/num2;
	return div;
	}
}
