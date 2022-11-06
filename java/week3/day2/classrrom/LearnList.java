package week3.day2.classrrom;

import java.util.ArrayList;
import java.util.List;

public class LearnList  {
public static void main(String[] args) {
List<Integer> list = new ArrayList<Integer>();
list.add(23);
list.add(54);
list.add(67);
list.add(55);
list.add(66);
list.add(42);
list.add(27);	
list.add(89);
System.out.println("Odd numbers are :" );
for(int i=0; i<=list.size()-1; i++) {
	if (list.get(i)%2==1) {
		System.out.println(list.get(i));
	}
}
if(1+1+1+1+1 ==5) {System.out.println("true");}
else {System.out.println("False");}
List<String> names = new ArrayList<String>();
names.add("Arun");
names.add("Deepa");
names.add("Maria");
names.add("Deepa");
names.add("Sharmila");
names.add("Muthu");
names.add("Chinrasu");
System.out.println("The person name starts with M are ");
for(String eachValue : names) {
	boolean m = eachValue.startsWith("M");
	if (m==true)
		System.out.println(eachValue);
}

}
}
