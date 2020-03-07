package medium;

import java.util.ArrayList;
import java.util.Collections;

public class CustomeObjectSorting {

	int age;
	String name;
	CustomeObjectSorting(int age,String name){
		
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return age+":"+name;
	}
	
	public static void main(String[] args) {
		ArrayList<CustomeObjectSorting> al = new ArrayList<CustomeObjectSorting>();
		al.add(new CustomeObjectSorting(2,"demo"));
		al.add(new CustomeObjectSorting(6,"sathish"));
		al.add(new CustomeObjectSorting(1,"siva"));
		al.add(new CustomeObjectSorting(66,"naveen"));
		al.add(new CustomeObjectSorting(34,"bavesh"));
		al.add(new CustomeObjectSorting(2989,"yaswanth"));
		System.out.println(al);
		Collections.sort(al,(e1,e2)->(e1.age>e2.age)?-1:(e1.age<e2.age)?1:(0));
		System.out.println(al);
	}
	
}
