package week3.day2.classrrom;

import java.util.HashSet;

public class PrintDuplicateNumbers {
	public static void main(String[] args) {
		int[] data = { 4, 3, 6, 8, 29, 1, 2, 4, 7, 8 };

		// Regular Loop
		for (int count = 0; count < data.length - 1; count++) {
			for (int j = count + 1; j < data.length; j++) {
				if (data[count] == data[j])
					System.out.println("Duplicate numbers in Array are " + data[j]);
			}
		}

		// Using Set
		HashSet<Integer> c = new HashSet<Integer>();
		HashSet<Integer> s = new HashSet<Integer>();
		for (Integer integer : data) {
			if (!c.add(integer)) {
				s.add(integer);
			}
		}
		System.out.println("Duplicate numbers in Set are " + s);
	}
}
