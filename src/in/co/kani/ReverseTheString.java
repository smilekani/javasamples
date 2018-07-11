package in.co.kani;

public class ReverseTheString {
	public static void main(String[] args) {
		String str = "kanimozhi";
		StringBuffer stringBuffer = new StringBuffer(str);
		StringBuffer reverse = stringBuffer.reverse();
		System.out.println("string Reverse using StringBuffer : "+stringBuffer +" & "+reverse);
		
		StringBuilder stringBuilder = new StringBuilder(str);
		System.out.println("String Reverse using StringBuilder : "+stringBuilder.reverse());
		
		String recursiveMethodString = recursiveMethod(str);
		
		System.out.println("String Reverse String using RecursiveMethod is : "+recursiveMethodString);
	}

	private static String recursiveMethod(String str) {
		
		if(str == null || str.length() <= 1)
			return str;
		return recursiveMethod(str.substring(1)) + str.charAt(0);
	}
}
