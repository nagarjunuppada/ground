package medium;

import java.util.function.Predicate;

public class PredicateExampleTwo {

	public static void main(String[] args) {
		int[] x= {1,3,45,54,55,34,22,2,12,21,11,10};
		
		Predicate<Integer> p=c->c>(32);//to print numbers >32
		Predicate< Integer> p1=c->c%2==0;//to print even numbers
		
		m1(p.negate(),x);
		
	} 
		
		
		public static void m1(Predicate<Integer> p,int[] x) 
		{
			
			for(int x1:x) {
				if(p.test(x1))
					System.out.print(x1+",");
			}
		}
		
	
	
	
	
	
	
	}


