package lcode_medium;

public class PatternPrintTwo {

	int rows = 10;
	public void printStars() {
		
	
	for(int i = 0;i<=rows-1;i++)
	{
		for (int j = 0; j <= i; j++) {
			System.out.print("*" + " ");
		}
		System.out.println("");
	}for(int i1 = rows-1 ;i1>=0;i1--)
	{
		for (int j = 0; j <= i1 - 1; j++) {
			System.out.print("*" + " ");
		}
		System.out.println("");
	}
	}
	public static void main(String[] args) {
		PatternPrintTwo ptw = new PatternPrintTwo();
		ptw.printStars();
	}
}
