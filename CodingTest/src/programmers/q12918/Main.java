package programmers.q12918;

// Lv.1 문자열 다루기 기본
// https://school.programmers.co.kr/learn/courses/30/lessons/12918
public class Main {
	class Solution {
	    public static boolean solution(String s) {
	    	if(s.length()==4 || s.length()==6) {
	    		for(int i=0; i<s.length(); i++) if(s.charAt(i)<'0' || s.charAt(i)>'9') return false;
	    		return true;
	    	}
	        return false;
	    }
	}
	public static void main(String[] args) {
		String s = "1234";
		System.out.println(Solution.solution(s));
	}
}
