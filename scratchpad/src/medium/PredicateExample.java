package medium;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class PredicateExample {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("adassa");
		al.add(2);
		al.add("namo");

		Predicate<Collection> p = c -> c.isEmpty();
		System.out.println(p.test(al));
	}

}
