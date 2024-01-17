package programmers.q12951;

// Lv.2 JadenCase 문자열 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/12951
public class Main2 {
	class Solution {
	    public static String solution(String s) {
	    	StringBuilder answer = new StringBuilder();
	    	String[] arr = s.toLowerCase().split("");
	    	boolean flag = true;
	    	for(String a: arr) {
	    		answer.append(flag ? a.toUpperCase() : a);
	    		flag = a.equals(" ") ? true : false;
	    	}
	        return answer.toString();
	    }
	}
	public static void main(String[] args) {
		String s = "  for the what 1what  ";
		System.out.println(Solution.solution(s));
	}
}
