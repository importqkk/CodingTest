package programmers.q17687;

// Lv.2 [3차] n진수 게임
// https://school.programmers.co.kr/learn/courses/30/lessons/17687
public class Main {
	class Solution {
	    public static String solution(int n, int t, int m, int p) {
	    	// n: 진법
	    	// t: 미리 구할 숫자의 갯수
	    	// m: 게임에 참가하는 인원
	    	// p: 튜브의 순서
	        StringBuilder answer = new StringBuilder();
	        int turn = 0;
	        String tmp;
	        for(int i=0; i<t*m; i++) {
	        	tmp = Integer.toString(i, n).toUpperCase();
	        	for(int j=0; j<tmp.length(); j++) {
	        		turn++;
	        		if(turn == p) {
	        			answer.append(tmp.substring(j, j+1));
	        			if(answer.toString().length() == t) break;
	        			p += m;
	        		}
	        	}
	        }
	        return answer.toString();
	    }
	}
	public static void main(String[] args) {
		int n = 2, t = 4, m = 2, p = 1;
		System.out.println(Solution.solution(n, t, m, p));
	}
}
