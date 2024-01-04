package programmers.q12916;

// Lv.1 문자열 내 p와 y의 개수
// https://school.programmers.co.kr/learn/courses/30/lessons/12916
public class Main {
	class Solution {
	    public static boolean solution(String s) {
	    	int p = 0, y = 0;
	    	s = s.toLowerCase();
	    	for(int i=0; i<s.length(); i++) {
	    		if(s.charAt(i) == 'p') p++;
	    		else if(s.charAt(i) == 'y') y++;
	    	}
	    	return p==y ? true : false;
	    }
	}
	public static void main(String[] args) {
		String s = "pPoooyY";
		System.out.println(Solution.solution(s));
	}
}
