package week1.day2;

public class PrintDuplicatesInArray {
	public static void main(String[] args) {

		int [] arr ={14,12,13,11,15,14,18,16,17,19,18,17,20};  
		System.out.println("Duplicate elements in given array: ");
		for(int count = 0; count < arr.length-1; count++) {  
			for(int j = count + 1; j < arr.length; j++) {  
				if(arr[count] == arr[j])  
					System.out.println(arr[j]);  
			}  
		}  
	}
}
