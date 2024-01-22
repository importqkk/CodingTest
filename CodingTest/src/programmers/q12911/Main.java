package programmers.q12911;

// Lv.2 다음 큰 숫자
// https://school.programmers.co.kr/learn/courses/30/lessons/12911
public class Main {
	class Solution {
	    public static int solution(int n) {
	    	int next = n, cnt1, cnt2;
	    	String b1 = Integer.toBinaryString(n), b2;
	    	while(true) {
	    		cnt1 = 0; cnt2 = 0; next++;
	    		b2 = Integer.toBinaryString(next);
		        for(int i=0; i<b1.length(); i++) if(b1.charAt(i) == '1') cnt1++;
		        for(int i=0; i<b2.length(); i++) {
		        	if(b2.charAt(i) == '1') cnt2++;
		        	if(cnt2 > cnt1) break;
		        }
		        if(cnt1 == cnt2) break;
	    	}
	        return next;
	    }
	}
	public static void main(String[] args) {
		int n = 78;
		System.out.println(Solution.solution(n));
	}
}
