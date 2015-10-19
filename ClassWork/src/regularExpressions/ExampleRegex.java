package regularExpressions;

public class ExampleRegex {

	public static void main (String[] args) {
		
		//System.out.println(" String has 10 digits: " + matchResult("1234567890123", ".*[0-9] {10} ."));
		
		/*
		
		^[a-z0-9_-] {3,15}
		^				   # Start of a line
		[a-z0-9_-]		   # Match char and symbols in the list, a-z, 0-9, underscore, hyphen 
		{3,15} 			   # Length at least 3 char and max length of 15
		$			       # End of the line
		
		*/
		//System.out.println(" User name is valid: " + matchResult("123456", "^[a-z0-9_-] {3,5}$"));
		
		
		System.out.println(" Password is vlid: " + matchResult("df5", "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@"));
		
	}
	
	public static boolean matchResult (String str, String re) {
		return str.matches(re);
	}
}
