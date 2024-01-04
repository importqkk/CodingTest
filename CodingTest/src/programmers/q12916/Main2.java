package programmers.q12916;

// Lv.1 문자열 내 p와 y의 개수
// https://school.programmers.co.kr/learn/courses/30/lessons/12916
public class Main2 {
	class Solution {
	    public static boolean solution(String s) {
	    	int cnt = 0;
	    	s = s.toLowerCase();
	    	for(int i=0; i<s.length(); i++) {
	    		switch(s.charAt(i)) {
					case 'p': cnt++; break;
					case 'y': cnt--; break;
				}
	    	}
	    	return cnt == 0;
	    }
	}
	public static void main(String[] args) {
		String s = "pPoooyY";
		System.out.println(Solution.solution(s));
	}
}
