package medium;

public class childrenExample extends Parent {
	int a=23;
	String s;
     
	/*public Example() {
		
		//
		super();
		System.out.println("age");
	}
	*/
	public void duymmyMethod() {
		
		System.out.println(super.a);
	}
	public static void main(String[] args) {
	Parent p = new childrenExample();
	p.parentduymmyMethod();
	
	
	
	childrenExample c = new childrenExample();
		p.duymmyMethod();
		
	}
	
}
