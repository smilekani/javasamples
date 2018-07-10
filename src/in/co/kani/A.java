package in.co.kani;

public class A {

	public final int x;
	
/*	static 
	{
		x =10;
	}*/
	
	{
		 x = 0;
	}
	
	public A()
	{
		
	}
	
	public A(int x1) {
//		x =x1;
	}

	
	public static void print()
	{
		System.out.println("Coming from A");
	}
	

	public static void main(String[] args) {
		
//		The final field A.x cannot be assigned
		
//		A.x = 10;
	}
	
}
