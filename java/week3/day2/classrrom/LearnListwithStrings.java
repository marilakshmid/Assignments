package week3.day2.classrrom;

import java.util.ArrayList;
import java.util.List;

public class LearnListwithStrings {
public static void main(String[] args) {
	List<String> list = new ArrayList<String>();
	list.add("Arun");
	list.add("Deepa");
	list.add("Maria");
	list.add("Deepa");
	list.add("Sharmila");
	list.add("Muthu");
	list.add("Chinrasu");
	for(String eachValue : list) {
		boolean m = eachValue.startsWith("M");
		if (m==true)
			System.out.println(eachValue);
	}
}
}
