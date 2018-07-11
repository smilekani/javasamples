package in.co.kani;

public class CheckIsNumorNot {
	public static void main(String[] args) {
		String num = "234567";
		try {
			int parseInt = Integer.parseInt(num);
			System.out.println("Is a Number!!!");
		} catch (NumberFormatException e) {
			System.out.println("Not a Number!!!");
			
		}
	}
}
