import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class Palindrome_Rich {
	
	
	public static boolean palindromeCheck(String input) {
		Queue<Character> q = new LinkedList<Character>();
		Stack<Character> s = new Stack<Character>();
		Character letter; 
		int mismatches = 0; 
		int i; 

		for (i = 0; i < input.length(); i++) {
			letter = input.charAt(i);
			if (Character.isLetter(letter)) {
				q.add(letter);
				s.push(letter);
			}
		}

		while (!q.isEmpty()) {
			if (q.remove() != s.pop())
				mismatches++;
		}

		
		return (mismatches == 0);
	}

}
