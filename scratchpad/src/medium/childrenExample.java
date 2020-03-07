package medium;

public class childrenExample extends Parent {
	int a=23;
	String s;
     
	/*public Example() {
		
		//
		super();
		System.out.println("age");
	}commenting for explanation
	*/
	public void duymmyMethod() {
		
		System.out.println(super.a);
	}
	public static void main(String[] args) {
	Parent p = new childrenExample();
	p.parentduymmyMethod();
	
	
	
	childrenExample c = new childrenExample();
		c.duymmyMethod();
		
	}
	
}
