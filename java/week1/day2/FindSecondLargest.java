package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {
public static void main(String[] args) {
	int[] data = {3,2,11,4,6,7};
	Arrays.sort(data); 
	System.out.println("Elements of array sorted in ascending order: "); 
	for (int i = 0; i < data.length; i++)   
	{       
	System.out.println(data[i]);   
	}   
	System.out.println("Second Element in the array is : " +data[data.length-4]);
}
}
