package in.co.kani;

public class ReverseWordInString {
	
	
	public void reverseWords(String str)
	{
		String[] split = str.split("\\s");
		String reversedStr = "";
		
		for (int i = split.length -1 ; i >= 0; i--) 
		{
			reversedStr = reversedStr + split[i] + " ";
		}
		
		System.out.println("Reversed String is : "+reversedStr);
		
	}
	
	
	public static void main(String[] args) {
		
		ReverseWordInString reverseWordInString = new ReverseWordInString();
		reverseWordInString.reverseWords("Todays Reverse word");

	}
}
