package programmers.q12922;

// Lv.1 수박수박수박수박수박수?
// https://school.programmers.co.kr/learn/courses/30/lessons/12922
public class Main {
	class Solution {
	    public static String solution(int n) {
	    	StringBuilder answer = new StringBuilder();
	    	for(int i=1; i<=n; i++) answer.append(i%2!=0 ? "수" : "박");
	        return answer.toString();
	    }
	}
	public static void main(String[] args) {
		int n = 4;
		System.out.println(Solution.solution(n));
	}
}
