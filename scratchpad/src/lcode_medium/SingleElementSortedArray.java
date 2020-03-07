package lcode_medium;
/*in a sorted array which consist of elements repating two times and only one element which
repeats only one time find that element*/
public class SingleElementSortedArray {
	//int[] input = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
	//int[] input = { 1, 1, 2,2, 3, 3, 4, 4, 8, 8,9 };
	int[] input = { 1,2,2, 3, 3, 4, 4, 8, 8,9,9 };
	 int oddElement=input[0];

public int oddelemtFinder() {
	
	for (int i = 1; i < input.length-1; i++) {
		
	if((!(input[i]==input[i-1])&&(!(input[i]==input[i+1])))) {
		oddElement=input[i];
		//return oddElement;
	}
	else if((input[input.length-1])!=(input[input.length-2])){
		oddElement=input[input.length-1];
	}
	}
	return oddElement;
}

	public static void main(String[] args) {
		SingleElementSortedArray sem = new SingleElementSortedArray();
		System.out.println(sem.oddelemtFinder());
	}
}
