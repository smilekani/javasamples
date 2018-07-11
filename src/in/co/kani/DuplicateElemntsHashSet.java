package in.co.kani;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElemntsHashSet {
	public static void main(String[] args) {
		String[] arr = {"abc", "xyz", "lmn", "pqr", "ijk", "lmn", "tqr", "xyz", "lmn", "lmn", "ijk"};
		Set<String> set = new HashSet<>();
		
		for (String string : arr) 
		{
			if(!set.add(string))
				System.out.println("The Dupl is : "+string);
		}
	}
}
