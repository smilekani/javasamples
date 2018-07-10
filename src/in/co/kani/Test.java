package in.co.kani;

public class Test {
	public static void main(String[] args) {
		
		// Type mismatch: cannot convert from A to B
		
//		B a = new A();
		
		A a = new B();
		
		a.print();
		System.out.println("x = before "+a.x);
//		a.x = 9;
		
		System.out.println("x = after "+a.x);
	}
}
