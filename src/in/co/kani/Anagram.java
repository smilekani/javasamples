package in.co.kani;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		isAnagram("kal1ai", "kila2a");
	}

	private static void isAnagram(String string, String string1) {
		boolean isAnagram = false;
		if(string.length() == string1.length())
		{
			char[] charArray = string.toCharArray();
			char[] charArray1 = string1.toCharArray();
			Arrays.sort(charArray);
			Arrays.sort(charArray1);
			isAnagram = Arrays.equals(charArray, charArray1);
		}
		if(isAnagram)
			System.out.println("The strings are Anagram ....");
		else
			System.out.println("The Strings are not Anagrams.....");
		
	}
}
