package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamArraylist {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1320);
		al.add(240);
		al.add(21250);
		al.add(29);
		al.add(2550);
		al.add(2370);
		al.add(2290);
	al.add(20);
	//filtering based on condition
	//List als= al.stream().filter(i->i%2==0).collect(Collectors.toList());
	List<Integer> al2 =al.stream().map(i->i*3).collect(Collectors.toList());
	//for default sorting order
	List lms = al.stream().sorted().collect(Collectors.toList());
	//for customised sorting order
	List customeorder=al.stream().sorted((l1,l2)->-l1.compareTo(l2)).collect(Collectors.toList());
	System.out.println(lms);
	System.out.println(customeorder);
}
}