package in.co.kani;

public class RemoveAllWhiteSpaces {
	public static void main(String[] args) {
		String str = "this is 		Java Programming 	";
		String noSpaceStr = str.replaceAll("\\s", "");
		System.out.println("No Space Str : "+noSpaceStr);
		
		// Without using replaceAll
		
		StringBuilder noSpaceString = new StringBuilder();
		
		for (int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i) != ' ' && str.charAt(i) != '\t')
				noSpaceString.append(str.charAt(i));
		}
		
		System.out.println("No Space Str without using replaceAll : "+noSpaceString);
		
		
	}
}
