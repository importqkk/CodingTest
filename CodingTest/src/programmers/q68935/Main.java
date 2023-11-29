package programmers.q68935;

// Lv.1 3진법 뒤집기
// https://school.programmers.co.kr/learn/courses/30/lessons/68935
public class Main {
	class Solution {
	    public static int solution(int n) {
	    	String tmp = Integer.toString(n, 3);
	        StringBuilder sb = new StringBuilder();
	        for(int i=tmp.length()-1; i>=0; i--) sb.append(tmp.charAt(i));
	        return Integer.parseInt(sb.toString(), 3);
	    }
	}
	public static void main(String[] args) {
		int n = 125;
		System.out.println(Solution.solution(n));
	}
}
