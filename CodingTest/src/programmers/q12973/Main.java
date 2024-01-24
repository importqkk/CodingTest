package programmers.q12973;
import java.util.Stack;

// Lv.2 짝지어 제거하기
// https://school.programmers.co.kr/learn/courses/30/lessons/12973
public class Main {
	class Solution {
	    public static int solution(String s) {
	        Stack<String> stack = new Stack<>();
	        String[] arr = s.split("");
	        for(int i=0; i<arr.length; i++) {
	        	if(!stack.isEmpty() && stack.peek().equals(arr[i])) stack.pop();
	        	else stack.add(arr[i]);
	        }
	        return stack.isEmpty() ? 1 : 0;
	    }
	}
	public static void main(String[] args) {
		String s = "abccaabaa";
		System.out.println(Solution.solution(s));
	}
}
