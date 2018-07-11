package in.co.kani;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElements {
	public static void main(String[] args) {
		
		String[] arr = {"abc", "xyz", "lmn", "pqr", "ijk", "lmn", "tqr", "xyz", "lmn", "lmn", "ijk"};
		Set<String> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i + 1; j < arr.length; j++) {
				
				if(arr[i].equals(arr[j]))
				{
					System.out.println("i = "+i + "&& j = "+j);
					System.out.println("Duplicate Element is : "+arr[j]);
					set.add(arr[j]);
				}
				
			}
			
		}
		
		System.out.println("The Duplicate Elements are : "+set);
		

	}
}
