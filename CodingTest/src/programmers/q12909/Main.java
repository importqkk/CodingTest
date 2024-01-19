package programmers.q12909;
import java.util.Stack;

// Lv.2 올바른 괄호
// https://school.programmers.co.kr/learn/courses/30/lessons/12909
public class Main {
	class Solution {
		static boolean solution(String s) {
	        Stack<Character> stack = new Stack<>();
	        char c;
	        for(int i=0; i<s.length(); i++) {
	        	c = s.charAt(i); 
	        	if(c == '(') stack.add(c);
	        	else {
	        		if(stack.isEmpty()) return false;
	        		stack.pop();
	        	}
	        }
	        if(stack.size() > 0) return false;
	        return true;
	    }
	}
	public static void main(String[] args) {
		String s = "(()(";
		System.out.println(Solution.solution(s));
	}
}
