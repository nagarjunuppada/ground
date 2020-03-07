package lcode_medium;

import java.util.HashMap;

public class SumOFdigitsInIntigerTotals {
	// int i=6111;

	HashMap<Integer, Integer> one = new HashMap<Integer, Integer>();


	public void catagorigingMethod(int n) {

		int temp = n;

		int sum = 0;

		while (n > 0 || sum > 9) {
			if (n == 0) {
				n = sum;
				sum = 0;
			}
			sum += n % 10;
			n /= 10;
		}
		// System.out.println(sum+""+temp);
		switch (sum) {
		case 9:
			one.put(temp, sum);
			break;

		default:
			// System.out.println(one);
			break;
		}

	}

	// for (int i = 6000; i <=6999; i++) {
	/*
	 * while (i != 0) { sum = sum + n % 10; n = n/10; }
	 * 
	 * System.out.println(sum); System.out.println("printing");
	 */
	public void printmap() {
		System.out.println(one);
	}

	public static void main(String[] args) {
		SumOFdigitsInIntigerTotals sdt = new SumOFdigitsInIntigerTotals();
		for (int n = 6000; n < 6999; n++) {
			// System.out.println(n);
			sdt.catagorigingMethod(n);

		}
		sdt.printmap();
	}

}
